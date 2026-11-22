<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myservlet.model.Order" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Orders</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 1150px;
            margin: 0 auto 25px auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            color: white;
            flex-wrap: wrap;
            gap: 12px;
        }

        .page-header h1 { font-size: 2rem; }

        .header-links a {
            color: white;
            text-decoration: none;
            font-weight: 600;
            margin-left: 12px;
            background: rgba(255,255,255,0.15);
            padding: 10px 18px;
            border-radius: 8px;
            transition: background 0.2s;
        }

        .header-links a:hover { background: rgba(255,255,255,0.3); }

        .table-card {
            max-width: 1150px;
            margin: 0 auto;
            background: white;
            border-radius: 16px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.2);
            overflow: hidden;
        }

        table { width: 100%; border-collapse: collapse; }

        th {
            background: #f4f2f8;
            text-align: left;
            padding: 14px 18px;
            font-size: 0.8rem;
            text-transform: uppercase;
            letter-spacing: 0.5px;
            color: #666;
        }

        td {
            padding: 14px 18px;
            border-top: 1px solid #f0f0f0;
            font-size: 0.88rem;
            color: #444;
            vertical-align: top;
        }

        .status-badge {
            display: inline-block;
            padding: 5px 12px;
            border-radius: 999px;
            font-size: 0.72rem;
            font-weight: 700;
            text-transform: uppercase;
        }

        .status-PLACED { background: #eef1ff; color: #5468d4; }
        .status-SHIPPED { background: #fff6e0; color: #b8860b; }
        .status-OUT_FOR_DELIVERY { background: #ffe9d6; color: #d2691e; }
        .status-DELIVERED { background: #e5f8ee; color: #2e8b57; }
        .status-CANCELLED { background: #fff1f1; color: #e53e3e; }

        select {
            padding: 8px 10px;
            border-radius: 6px;
            border: 1px solid #ddd;
            font-size: 0.85rem;
            margin-right: 8px;
        }

        .status-form button {
            padding: 8px 14px;
            border: none;
            border-radius: 6px;
            background: #764ba2;
            color: white;
            font-weight: 600;
            font-size: 0.8rem;
            cursor: pointer;
        }

        .status-form button:hover { background: #5a3a7e; }

        .track-link {
            display: block;
            margin-top: 8px;
            font-size: 0.8rem;
            color: #667eea;
            text-decoration: none;
            font-weight: 600;
        }

        .empty-row td { text-align: center; color: #999; padding: 30px; }
    </style>
</head>
<body>

    <div class="page-header">
        <h1>Manage Orders</h1>
        <div class="header-links">
            <a href="dashboard">Dashboard</a>
            <a href="../logout.jsp">Logout</a>
        </div>
    </div>

    <div class="table-card">
        <table>
            <tr>
                <th>Order</th>
                <th>Customer</th>
                <th>Items</th>
                <th>Total</th>
                <th>Payment</th>
                <th>Status</th>
                <th>Update</th>
            </tr>
            <%
                @SuppressWarnings("unchecked")
                List<Order> orders = (List<Order>) request.getAttribute("orders");
            %>
            <% if (orders == null || orders.isEmpty()) { %>
                <tr class="empty-row"><td colspan="7">No orders yet.</td></tr>
            <% } else { %>
                <% for (Order o : orders) { %>
                    <tr>
                        <td>
                            #<%= o.getOrderId() %><br>
                            <span style="color:#999; font-size:0.78rem;"><%= o.getOrderDate() %></span>
                        </td>
                        <td><%= o.getUsername() %></td>
                        <td style="max-width:220px;"><%= o.getItemsSummary() %></td>
                        <td>&#8377;<%= (int) o.getTotalAmount() %></td>
                        <td><%= o.getPaymentDetail() %></td>
                        <td>
                            <span class="status-badge status-<%= o.getStatus() %>"><%= o.getStatus().replace("_", " ") %></span>
                            <a class="track-link" href="../trackOrder?orderId=<%= o.getOrderId() %>">View timeline</a>
                        </td>
                        <td>
                            <form class="status-form" action="updateOrderStatus" method="post" style="display:flex; align-items:center;">
                                <input type="hidden" name="orderId" value="<%= o.getOrderId() %>">
                                <select name="status">
                                    <option value="PLACED" <%= "PLACED".equals(o.getStatus()) ? "selected" : "" %>>Placed</option>
                                    <option value="SHIPPED" <%= "SHIPPED".equals(o.getStatus()) ? "selected" : "" %>>Shipped</option>
                                    <option value="OUT_FOR_DELIVERY" <%= "OUT_FOR_DELIVERY".equals(o.getStatus()) ? "selected" : "" %>>Out for Delivery</option>
                                    <option value="DELIVERED" <%= "DELIVERED".equals(o.getStatus()) ? "selected" : "" %>>Delivered</option>
                                    <option value="CANCELLED" <%= "CANCELLED".equals(o.getStatus()) ? "selected" : "" %>>Cancelled</option>
                                </select>
                                <button type="submit">Update</button>
                            </form>
                        </td>
                    </tr>
                <% } %>
            <% } %>
        </table>
    </div>

</body>
</html>
