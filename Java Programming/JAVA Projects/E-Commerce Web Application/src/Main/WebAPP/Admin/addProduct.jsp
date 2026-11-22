<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Product</title>
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

        .error-box {
            background: #fff1f1;
            color: #e53e3e;
            padding: 12px 16px;
            border-radius: 8px;
            font-size: 0.9rem;
            margin-bottom: 20px;
            border: 1px solid #ffd6d6;
        }

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

    <div class="form-card">
        <h2>Add New Product</h2>

        <% if (request.getAttribute("errorMessage") != null) { %>
            <div class="error-box"><%= request.getAttribute("errorMessage") %></div>
        <% } %>

        <form action="addProduct" method="post">
            <label for="name">Product Name</label>
            <input type="text" name="name" id="name" required>

            <label for="description">Description</label>
            <textarea name="description" id="description" rows="3" required></textarea>

            <div class="row">
                <div>
                    <label for="price">Price (&#8377;)</label>
                    <input type="text" name="price" id="price" required>
                </div>
                <div>
                    <label for="quantity">Quantity</label>
                    <input type="text" name="quantity" id="quantity" required>
                </div>
            </div>

            <label for="category">Category</label>
            <input type="text" name="category" id="category" required>

            <label for="imageUrl">Image URL (optional)</label>
            <input type="text" name="imageUrl" id="imageUrl" placeholder="https://...">

            <input type="submit" value="Add Product">
        </form>

        <a href="manageProducts" class="back-link">&larr; Back to products</a>
    </div>

</body>
</html>
