<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.myservlet.model.Product" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Product</title>
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

        .form-card {
            background: white;
            width: 100%;
            max-width: 460px;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 20px 50px rgba(0,0,0,0.3);
        }

        h2 { text-align: center; color: #333; margin-bottom: 25px; }

        label {
            display: block;
            margin-bottom: 6px;
            font-size: 0.85rem;
            font-weight: 600;
            color: #555;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        input[type="text"], textarea {
            width: 100%;
            padding: 12px 14px;
            margin-bottom: 18px;
            border: 1.5px solid #e1e1e1;
            border-radius: 8px;
            font-size: 1rem;
            outline: none;
            background-color: #f9f9f9;
            font-family: inherit;
            resize: vertical;
        }

        input[type="text"]:focus, textarea:focus {
            border-color: #764ba2;
            background-color: #fff;
            box-shadow: 0 0 0 4px rgba(118, 75, 162, 0.1);
        }

        .row { display: flex; gap: 14px; }
        .row > div { flex: 1; }

        input[type="submit"] {
            width: 100%;
            background: #764ba2;
            color: white;
            border: none;
            padding: 14px;
            border-radius: 8px;
            font-size: 1.1rem;
            font-weight: 600;
            cursor: pointer;
            margin-top: 10px;
        }

        input[type="submit"]:hover { background: #5a3a7e; }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #764ba2;
            text-decoration: none;
            font-weight: 600;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>

    <%
        Product p = (Product) request.getAttribute("product");
    %>

    <div class="form-card">
        <h2>Edit Product</h2>

        <form action="updateProduct" method="post">
            <input type="hidden" name="productId" value="<%= p.getProductId() %>">

            <label for="name">Product Name</label>
            <input type="text" name="name" id="name" value="<%= p.getName() %>" required>

            <label for="description">Description</label>
            <textarea name="description" id="description" rows="3" required><%= p.getDescription() %></textarea>

            <div class="row">
                <div>
                    <label for="price">Price (&#8377;)</label>
                    <input type="text" name="price" id="price" value="<%= p.getPrice() %>" required>
                </div>
                <div>
                    <label for="quantity">Quantity</label>
                    <input type="text" name="quantity" id="quantity" value="<%= p.getQuantity() %>" required>
                </div>
            </div>

            <label for="category">Category</label>
            <input type="text" name="category" id="category" value="<%= p.getCategory() %>" required>

            <label for="imageUrl">Image URL</label>
            <input type="text" name="imageUrl" id="imageUrl" value="<%= p.getImageUrl() != null ? p.getImageUrl() : "" %>">

            <input type="submit" value="Save Changes">
        </form>

        <a href="manageProducts" class="back-link">&larr; Back to products</a>
    </div>

</body>
</html>
