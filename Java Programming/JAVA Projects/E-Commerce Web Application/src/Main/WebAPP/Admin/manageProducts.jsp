<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myservlet.model.Product" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Products</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 1100px;
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
            max-width: 1100px;
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
            font-size: 0.9rem;
            color: #444;
        }

        .actions a {
            text-decoration: none;
            font-weight: 600;
            font-size: 0.85rem;
            margin-right: 14px;
        }

        .edit-link { color: #667eea; }
        .delete-link { color: #e53e3e; }

        .empty-row td { text-align: center; color: #999; padding: 30px; }
    </style>
</head>
<body>

    <div class="page-header">
        <h1>Manage Products</h1>
        <div class="header-links">
            <a href="addProduct">+ Add Product</a>
            <a href="dashboard">Dashboard</a>
            <a href="../logout.jsp">Logout</a>
        </div>
    </div>

    <div class="table-card">
        <table>
            <tr>
                <th>Name</th>
                <th>Category</th>
                <th>Price</th>
                <th>Qty</th>
                <th>Actions</th>
            </tr>
            <%
                @SuppressWarnings("unchecked")
                List<Product> products = (List<Product>) request.getAttribute("products");
            %>
            <% if (products == null || products.isEmpty()) { %>
                <tr class="empty-row"><td colspan="5">No products yet. Add your first one.</td></tr>
            <% } else { %>
                <% for (Product p : products) { %>
                    <tr>
                        <td><%= p.getName() %></td>
                        <td><%= p.getCategory() %></td>
                        <td>&#8377;<%= (int) p.getPrice() %></td>
                        <td><%= p.getQuantity() %></td>
                        <td class="actions">
                            <a class="edit-link" href="updateProduct?id=<%= p.getProductId() %>">Edit</a>
                            <a class="delete-link" href="deleteProduct?id=<%= p.getProductId() %>" onclick="return confirm('Delete this product?');">Delete</a>
                        </td>
                    </tr>
                <% } %>
            <% } %>
        </table>
    </div>

</body>
</html>
