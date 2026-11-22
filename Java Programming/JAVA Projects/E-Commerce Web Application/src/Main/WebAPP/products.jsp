<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myservlet.model.Product" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Our Products</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 1100px;
            margin: 0 auto 30px auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            color: white;
        }

        .page-header h1 {
            font-size: 2rem;
            letter-spacing: 1px;
        }

        .header-links a {
            color: white;
            text-decoration: none;
            font-weight: 600;
            margin-left: 20px;
            background: rgba(255,255,255,0.15);
            padding: 10px 18px;
            border-radius: 8px;
            transition: background 0.2s;
        }

        .header-links a:hover {
            background: rgba(255,255,255,0.3);
        }

        .products-grid {
            max-width: 1100px;
            margin: 0 auto;
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(240px, 1fr));
            gap: 24px;
        }

        .product-card {
            background: white;
            border-radius: 16px;
            padding: 20px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.2);
            display: flex;
            flex-direction: column;
        }

        .product-card img {
            width: 100%;
            height: 160px;
            object-fit: cover;
            border-radius: 10px;
            margin-bottom: 14px;
            background: #f0f0f0;
        }

        .product-name {
            font-size: 1.15rem;
            font-weight: 700;
            color: #333;
            margin-bottom: 6px;
        }

        .product-category {
            font-size: 0.75rem;
            text-transform: uppercase;
            letter-spacing: 0.5px;
            color: #888;
            margin-bottom: 10px;
        }

        .product-description {
            font-size: 0.9rem;
            color: #666;
            margin-bottom: 14px;
            flex-grow: 1;
        }

        .product-price {
            font-size: 1.3rem;
            font-weight: 800;
            color: #764ba2;
            margin-bottom: 14px;
        }

        .product-stock {
            font-size: 0.8rem;
            margin-bottom: 12px;
        }

        .in-stock { color: #2e8b57; }
        .out-of-stock { color: #e53e3e; }

        .btn-add {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            background: #764ba2;
            color: white;
            font-size: 0.95rem;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s, transform 0.2s;
        }

        .btn-add:hover:not(:disabled) {
            background: #5a3a7e;
            transform: translateY(-2px);
        }

        .btn-add:disabled {
            background: #ccc;
            cursor: not-allowed;
        }

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
    </style>
</head>
<body>

    <div class="page-header">
        <h1>Our Products</h1>
        <div class="header-links">
            <% if ("ADMIN".equalsIgnoreCase((String) session.getAttribute("role"))) { %>
                <a href="admin/dashboard">Admin Dashboard</a>
            <% } %>
            <a href="myOrders">My Orders</a>
            <a href="cart">View Cart</a>
            <a href="logout.jsp">Logout</a>
        </div>
    </div>

    <%
        @SuppressWarnings("unchecked")
        List<Product> products = (List<Product>) request.getAttribute("products");
    %>

    <% if (products == null || products.isEmpty()) { %>
        <div class="empty-state">
            <p>No products available right now. Please check back later.</p>
        </div>
    <% } else { %>
        <form action="cart" method="post">
            <div class="products-grid">
                <% for (Product p : products) { %>
                    <div class="product-card">
                        <img src="<%= p.getImageUrl() != null ? p.getImageUrl() : "https://via.placeholder.com/240x160?text=No+Image" %>" alt="<%= p.getName() %>">
                        <div class="product-name"><%= p.getName() %></div>
                        <div class="product-category"><%= p.getCategory() %></div>
                        <div class="product-description"><%= p.getDescription() %></div>
                        <div class="product-price">&#8377;<%= (int) p.getPrice() %></div>

                        <% if (p.getQuantity() > 0) { %>
                            <div class="product-stock in-stock"><%= p.getQuantity() %> in stock</div>
                            <label style="display:flex; align-items:center; gap:8px; margin-bottom:10px;">
                                <input type="checkbox" name="product" value="<%= p.getProductId() %>">
                                Add to cart
                            </label>
                        <% } else { %>
                            <div class="product-stock out-of-stock">Out of stock</div>
                        <% } %>
                    </div>
                <% } %>
            </div>

            <div style="max-width:1100px; margin: 24px auto 0 auto;">
                <button type="submit" class="btn-add">Add Selected to Cart</button>
            </div>
        </form>
    <% } %>

</body>
</html>
