<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myservlet.model.Order" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Orders</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 800px;
            margin: 0 auto 30px auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            color: white;
        }

        .page-header h1 { font-size: 2rem; }

        .header-links a {
            color: white;
            text-decoration: none;
            font-weight: 600;
            margin-left: 16px;
            background: rgba(255,255,255,0.15);
            padding: 10px 18px;
            border-radius: 8px;
            transition: background 0.2s;
        }

        .header-links a:hover { background: rgba(255,255,255,0.3); }

        .orders-list {
            max-width: 800px;
            margin: 0 auto;
            display: flex;
            flex-direction: column;
            gap: 18px;
        }

        .order-card {
            background: white;
            border-radius: 14px;
            padding: 22px 26px;
            box-shadow: 0 12px 30px rgba(0,0,0,0.18);
            display: flex;
            justify-content: space-between;
            align-items: center;
            gap: 20px;
            flex-wrap: wrap;
        }

        .order-info { flex: 1; min-width: 220px; }

        .order-id { font-weight: 700; color: #333; margin-bottom: 4px; }

        .order-date { font-size: 0.8rem; color: #999; margin-bottom: 10px; }

        .order-items { font-size: 0.9rem; color: #666; margin-bottom: 8px; }

        .order-total { font-weight: 700; color: #764ba2; font-size: 1.1rem; }

        .status-badge {
            display: inline-block;
            padding: 6px 14px;
            border-radius: 999px;
            font-size: 0.75rem;
            font-weight: 700;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        .status-PLACED { background: #eef1ff; color: #5468d4; }
        .status-SHIPPED { background: #fff6e0; color: #b8860b; }
        .status-OUT_FOR_DELIVERY { background: #ffe9d6; color: #d2691e; }
        .status-DELIVERED { background: #e5f8ee; color: #2e8b57; }
        .status-CANCELLED { background: #fff1f1; color: #e53e3e; }

        .btn-track {
            background: #764ba2;
            color: white;
            text-decoration: none;
            padding: 10px 18px;
            border-radius: 8px;
            font-weight: 600;
            font-size: 0.9rem;
            white-space: nowrap;
            transition: background 0.2s, transform 0.2s;
        }

        .btn-track:hover { background: #5a3a7e; transform: translateY(-2px); }

        .empty-state {
            max-width: 500px;
            margin: 60px auto;
            background: white;
            border-radius: 16px;
            padding: 40px;
            text-align: center;
            color: #888;
            box-shadow: 0 15px 35px rgba(0,0,0,0.2);
        }

        .empty-state a {
            display: inline-block;
            margin-top: 16px;
            color: #764ba2;
            font-weight: 600;
            text-decoration: none;
        }
    </style>
</head>
<body>

    <div class="page-header">
        <h1>My Orders</h1>
        <div class="header-links">
            <a href="products">Shop</a>
            <a href="logout.jsp">Logout</a>
        </div>
    </div>

    <%
        @SuppressWarnings("unchecked")
        List<Order> orders = (List<Order>) request.getAttribute("orders");
    %>

    <% if (orders == null || orders.isEmpty()) { %>
        <div class="empty-state">
            <p>You haven't placed any orders yet.</p>
            <a href="products">Start Shopping &rarr;</a>
        </div>
    <% } else { %>
        <div class="orders-list">
            <% for (Order o : orders) { %>
                <div class="order-card">
                    <div class="order-info">
                        <div class="order-id">Order #<%= o.getOrderId() %></div>
                        <div class="order-date"><%= o.getOrderDate() %></div>
                        <div class="order-items"><%= o.getItemsSummary() %></div>
                        <div class="order-total">&#8377;<%= (int) o.getTotalAmount() %></div>
                    </div>
                    <div style="display:flex; flex-direction:column; align-items:flex-end; gap:12px;">
                        <span class="status-badge status-<%= o.getStatus() %>"><%= o.getStatus().replace("_", " ") %></span>
                        <a href="trackOrder?orderId=<%= o.getOrderId() %>" class="btn-track">Track Order</a>
                    </div>
                </div>
            <% } %>
        </div>
    <% } %>

</body>
</html>
