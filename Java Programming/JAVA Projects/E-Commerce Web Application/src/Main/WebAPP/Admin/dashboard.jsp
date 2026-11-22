<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 900px;
            margin: 0 auto 40px auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            color: white;
        }

        .page-header h1 { font-size: 2rem; }

        .page-header a {
            color: white;
            text-decoration: none;
            font-weight: 600;
            background: rgba(255,255,255,0.15);
            padding: 10px 18px;
            border-radius: 8px;
            transition: background 0.2s;
        }

        .page-header a:hover { background: rgba(255,255,255,0.3); }

        .grid {
            max-width: 900px;
            margin: 0 auto;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 22px;
        }

        .tile {
            background: white;
            border-radius: 16px;
            padding: 30px 24px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.2);
            text-decoration: none;
            display: block;
            transition: transform 0.2s;
        }

        .tile:hover { transform: translateY(-4px); }

        .tile-icon { font-size: 2rem; margin-bottom: 14px; }
        .tile-title { font-size: 1.15rem; font-weight: 700; color: #333; margin-bottom: 6px; }
        .tile-desc { font-size: 0.85rem; color: #888; }
    </style>
</head>
<body>

    <div class="page-header">
        <h1>Admin Dashboard</h1>
        <a href="../logout.jsp">Logout</a>
    </div>

    <div class="grid">
        <a class="tile" href="manageProducts">
            <div class="tile-icon">&#128230;</div>
            <div class="tile-title">Manage Products</div>
            <div class="tile-desc">Add, edit or remove products</div>
        </a>

        <a class="tile" href="viewOrders">
            <div class="tile-icon">&#128722;</div>
            <div class="tile-title">Manage Orders</div>
            <div class="tile-desc">View and update order status</div>
        </a>

        <a class="tile" href="viewUsers">
            <div class="tile-icon">&#128101;</div>
            <div class="tile-title">View Users</div>
            <div class="tile-desc">See all registered customers</div>
        </a>

        <a class="tile" href="addProduct">
            <div class="tile-icon">&#10133;</div>
            <div class="tile-title">Add Product</div>
            <div class="tile-desc">List a new product for sale</div>
        </a>
    </div>

</body>
</html>
