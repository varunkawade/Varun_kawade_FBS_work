<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="com.myservlet.dao.ProductDAO" %>
<%@ page import="com.myservlet.model.Product" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Cart</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }

        .cart-card {
            background: white;
            width: 100%;
            max-width: 460px;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 20px 50px rgba(0,0,0,0.3);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
            border-bottom: 2px dashed #eee;
            padding-bottom: 15px;
        }

        .cart-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 14px 0;
            border-bottom: 1px solid #f0f0f0;
        }

        .item-name {
            font-weight: 600;
            color: #444;
        }

        .item-price {
            color: #764ba2;
            font-weight: 700;
        }

        .remove-link {
            color: #e53e3e;
            text-decoration: none;
            font-size: 0.8rem;
            font-weight: 600;
            margin-left: 12px;
        }

        .remove-link:hover {
            text-decoration: underline;
        }

        .total-row {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
            padding-top: 15px;
            border-top: 3px solid #f0f0f0;
            font-weight: 800;
            font-size: 1.2rem;
            color: #222;
        }

        .btn {
            display: block;
            width: 100%;
            text-align: center;
            padding: 14px;
            border-radius: 10px;
            text-decoration: none;
            font-weight: 600;
            margin-top: 16px;
            transition: transform 0.2s;
        }

        .btn-checkout {
            background: #764ba2;
            color: white;
        }

        .btn-checkout:hover { transform: translateY(-2px); }

        .btn-continue {
            background: #f1f5ff;
            color: #667eea;
        }

        .empty {
            text-align: center;
            color: #999;
            padding: 20px 0;
        }
    </style>
</head>
<body>

    <div class="cart-card">
        <h2>Your Cart</h2>

        <%
            String[] cartIds = (String[]) session.getAttribute("cart");
            Connection dbcon = (Connection) application.getAttribute("dbcon");
            ProductDAO productDAO = new ProductDAO(dbcon);
            double total = 0;
            int itemCount = 0;

            if (cartIds != null) {
                for (String idStr : cartIds) {
                    Product p = null;
                    try {
                        p = productDAO.getProductById(Integer.parseInt(idStr));
                    } catch (Exception ex) {
                        continue;
                    }
                    if (p == null) continue;
                    itemCount++;
                    total += p.getPrice();
        %>
            <div class="cart-item">
                <div>
                    <div class="item-name"><%= p.getName() %></div>
                    <a class="remove-link" href="removeFromCart?product_id=<%= idStr %>">Remove</a>
                </div>
                <div class="item-price">&#8377;<%= (int) p.getPrice() %></div>
            </div>
        <%
                }
            }

            if (itemCount == 0) {
        %>
            <p class="empty">Your cart is empty.</p>
            <a href="products" class="btn btn-continue">Browse Products</a>
        <%
            } else {
        %>
            <div class="total-row">
                <span>Total</span>
                <span>&#8377;<%= (int) total %></span>
            </div>

            <a href="payment" class="btn btn-checkout">Proceed to Payment</a>
            <a href="products" class="btn btn-continue">Continue Shopping</a>
        <%
            }
        %>
    </div>

</body>
</html>