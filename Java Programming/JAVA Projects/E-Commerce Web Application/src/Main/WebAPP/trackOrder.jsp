<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.myservlet.model.Order" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Track Order</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 30px 20px;
        }

        .track-card {
            background: white;
            width: 100%;
            max-width: 640px;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 20px 50px rgba(0,0,0,0.3);
        }

        .order-id { font-size: 0.85rem; color: #999; margin-bottom: 4px; }
        h2 { color: #333; margin-bottom: 6px; }
        .order-items { color: #666; font-size: 0.95rem; margin-bottom: 4px; }
        .order-total { color: #764ba2; font-weight: 700; font-size: 1.2rem; margin-bottom: 30px; }

        /* Cancelled banner */
        .cancelled-banner {
            background: #fff1f1;
            color: #e53e3e;
            padding: 16px 20px;
            border-radius: 10px;
            font-weight: 600;
            margin-bottom: 20px;
            text-align: center;
        }

        /* Tracker */
        .tracker {
            display: flex;
            justify-content: space-between;
            position: relative;
            margin: 40px 0 10px 0;
        }

        .tracker::before {
            content: '';
            position: absolute;
            top: 14px;
            left: 30px;
            right: 30px;
            height: 4px;
            background: #eee;
            z-index: 0;
        }

        .tracker-fill {
            position: absolute;
            top: 14px;
            left: 30px;
            height: 4px;
            background: #764ba2;
            z-index: 1;
            transition: width 0.4s ease;
        }

        .step {
            position: relative;
            z-index: 2;
            display: flex;
            flex-direction: column;
            align-items: center;
            flex: 1;
        }

        .dot {
            width: 30px;
            height: 30px;
            border-radius: 50%;
            background: #eee;
            color: #999;
            display: flex;
            align-items: center;
            justify-content: center;
            font-weight: 700;
            font-size: 0.85rem;
            margin-bottom: 10px;
        }

        .step.done .dot { background: #764ba2; color: white; }
        .step.current .dot { background: #764ba2; color: white; box-shadow: 0 0 0 6px rgba(118, 75, 162, 0.2); }

        .step-label {
            font-size: 0.75rem;
            text-align: center;
            color: #888;
            font-weight: 600;
            max-width: 80px;
        }

        .step.done .step-label, .step.current .step-label { color: #764ba2; }

        .status-text {
            text-align: center;
            margin-top: 30px;
            padding: 16px;
            background: #f4f2f8;
            border-radius: 10px;
            color: #555;
            font-size: 0.95rem;
        }

        .payment-info {
            margin-top: 20px;
            font-size: 0.9rem;
            color: #666;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 25px;
            color: #764ba2;
            text-decoration: none;
            font-weight: 600;
            font-size: 0.9rem;
        }

        .back-link:hover { text-decoration: underline; }
    </style>
</head>
<body>

    <%
        Order order = (Order) request.getAttribute("order");
        Boolean isAdminAttr = (Boolean) request.getAttribute("isAdmin");
        boolean isAdmin = isAdminAttr != null && isAdminAttr;

        String status = order.getStatus();
        String[] stages = { "PLACED", "SHIPPED", "OUT_FOR_DELIVERY", "DELIVERED" };
        String[] stageLabels = { "Order Placed", "Shipped", "Out for Delivery", "Delivered" };

        int currentIndex = -1;
        for (int i = 0; i < stages.length; i++) {
            if (stages[i].equals(status)) { currentIndex = i; break; }
        }

        boolean cancelled = "CANCELLED".equals(status);
        double fillPercent = 0;
        if (!cancelled && currentIndex >= 0) {
            fillPercent = (currentIndex / (double) (stages.length - 1)) * 100;
        }
    %>

    <div class="track-card">
        <div class="order-id">Order #<%= order.getOrderId() %> &middot; <%= order.getOrderDate() %></div>
        <h2>Track Your Order</h2>
        <div class="order-items"><%= order.getItemsSummary() %></div>
        <div class="order-total">&#8377;<%= (int) order.getTotalAmount() %></div>

        <% if (cancelled) { %>
            <div class="cancelled-banner">This order was cancelled.</div>
        <% } else { %>
            <div class="tracker">
                <div class="tracker-fill" style="width: <%= fillPercent %>%;"></div>
                <% for (int i = 0; i < stages.length; i++) {
                    String cls = "";
                    if (i < currentIndex) cls = "done";
                    else if (i == currentIndex) cls = "current";
                %>
                    <div class="step <%= cls %>">
                        <div class="dot"><%= (i < currentIndex || i == currentIndex) ? "&#10003;" : (i + 1) %></div>
                        <div class="step-label"><%= stageLabels[i] %></div>
                    </div>
                <% } %>
            </div>

            <div class="status-text">
                <% if ("DELIVERED".equals(status)) { %>
                    Your order has been delivered. We hope you enjoy it!
                <% } else if ("OUT_FOR_DELIVERY".equals(status)) { %>
                    Your order is out for delivery and should arrive soon.
                <% } else if ("SHIPPED".equals(status)) { %>
                    Your order has shipped and is on its way.
                <% } else { %>
                    Your order has been placed and is being prepared.
                <% } %>
            </div>
        <% } %>

        <div class="payment-info">
            <strong>Payment:</strong> <%= order.getPaymentDetail() %>
        </div>

        <a href="<%= isAdmin ? "admin/viewOrders" : "myOrders" %>" class="back-link">&larr; Back to <%= isAdmin ? "all orders" : "my orders" %></a>
    </div>

</body>
</html>
	