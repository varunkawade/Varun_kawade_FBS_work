<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment</title>
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

        .payment-card {
            background: white;
            width: 100%;
            max-width: 440px;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 20px 50px rgba(0,0,0,0.3);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 8px;
        }

        .subtitle {
            text-align: center;
            color: #888;
            font-size: 0.9rem;
            margin-bottom: 25px;
        }

        .error-box {
            background: #fff1f1;
            color: #e53e3e;
            padding: 12px 16px;
            border-radius: 8px;
            font-size: 0.9rem;
            margin-bottom: 20px;
            border: 1px solid #ffd6d6;
        }

        .method-tabs {
            display: flex;
            gap: 8px;
            margin-bottom: 25px;
            border-radius: 10px;
            background: #f4f2f8;
            padding: 6px;
        }

        .method-tab {
            flex: 1;
            text-align: center;
            padding: 10px 6px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 0.85rem;
            font-weight: 600;
            color: #764ba2;
            transition: all 0.2s ease;
            user-select: none;
        }

        .method-tab.active {
            background: #764ba2;
            color: white;
            box-shadow: 0 4px 12px rgba(118, 75, 162, 0.3);
        }

        .method-tab input {
            display: none;
        }

        .method-panel {
            display: none;
        }

        .method-panel.active {
            display: block;
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

        input[type="text"] {
            width: 100%;
            padding: 12px 14px;
            margin-bottom: 18px;
            border: 1.5px solid #e1e1e1;
            border-radius: 8px;
            font-size: 1rem;
            outline: none;
            transition: all 0.3s ease;
            background-color: #f9f9f9;
        }

        input[type="text"]:focus {
            border-color: #764ba2;
            background-color: #fff;
            box-shadow: 0 0 0 4px rgba(118, 75, 162, 0.1);
        }

        .row {
            display: flex;
            gap: 14px;
        }

        .row > div {
            flex: 1;
        }

        .cod-note {
            background: #f4f2f8;
            color: #555;
            padding: 16px;
            border-radius: 10px;
            font-size: 0.9rem;
            margin-bottom: 18px;
            line-height: 1.5;
        }

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
            transition: background 0.3s, transform 0.2s;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background: #5a3a7e;
            transform: translateY(-1px);
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #764ba2;
            text-decoration: none;
            font-weight: 600;
            font-size: 0.9rem;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="payment-card">
        <h2>Payment Details</h2>
        <p class="subtitle">Choose how you'd like to pay</p>

        <% if (request.getAttribute("errorMessage") != null) { %>
            <div class="error-box"><%= request.getAttribute("errorMessage") %></div>
        <% } %>

        <%
            // Preserve the previously selected tab if the form was redisplayed after a validation error
            String selectedMethod = request.getParameter("paymentMethod");
            if (selectedMethod == null) selectedMethod = "CARD";
        %>

        <form action="payment" method="post" id="paymentForm">

            <div class="method-tabs">
                <label class="method-tab <%= "CARD".equals(selectedMethod) ? "active" : "" %>" data-method="CARD">
                    <input type="radio" name="methodTab" value="CARD" <%= "CARD".equals(selectedMethod) ? "checked" : "" %>>
                    Card
                </label>
                <label class="method-tab <%= "UPI".equals(selectedMethod) ? "active" : "" %>" data-method="UPI">
                    <input type="radio" name="methodTab" value="UPI" <%= "UPI".equals(selectedMethod) ? "checked" : "" %>>
                    UPI
                </label>
                <label class="method-tab <%= "COD".equals(selectedMethod) ? "active" : "" %>" data-method="COD">
                    <input type="radio" name="methodTab" value="COD" <%= "COD".equals(selectedMethod) ? "checked" : "" %>>
                    Cash on Delivery
                </label>
            </div>

            <input type="hidden" name="paymentMethod" id="paymentMethod" value="<%= selectedMethod %>">

            <!-- Card panel -->
            <div class="method-panel <%= "CARD".equals(selectedMethod) ? "active" : "" %>" id="panel-CARD">
                <label for="cardName">Cardholder Name</label>
                <input type="text" name="cardName" id="cardName" placeholder="Name on card">

                <label for="cardNumber">Card Number</label>
                <input type="text" name="cardNumber" id="cardNumber" placeholder="16 digit card number" maxlength="19">

                <div class="row">
                    <div>
                        <label for="expiry">Expiry (MM/YY)</label>
                        <input type="text" name="expiry" id="expiry" placeholder="MM/YY" maxlength="5">
                    </div>
                    <div>
                        <label for="cvv">CVV</label>
                        <input type="text" name="cvv" id="cvv" placeholder="3 digit" maxlength="3">
                    </div>
                </div>
            </div>

            <!-- UPI panel -->
            <div class="method-panel <%= "UPI".equals(selectedMethod) ? "active" : "" %>" id="panel-UPI">
                <label for="upiId">UPI ID</label>
                <input type="text" name="upiId" id="upiId" placeholder="yourname@bank">
            </div>

            <!-- Cash on Delivery panel -->
            <div class="method-panel <%= "COD".equals(selectedMethod) ? "active" : "" %>" id="panel-COD">
                <div class="cod-note">
                    Pay in cash when your order is delivered. Please keep the exact amount ready for the delivery person.
                </div>
            </div>

            <input type="submit" value="Confirm Order">
        </form>

        <a href="cart.jsp" class="back-link">&larr; Back to cart</a>
    </div>

    <script>
        const tabs = document.querySelectorAll('.method-tab');
        const panels = document.querySelectorAll('.method-panel');
        const methodInput = document.getElementById('paymentMethod');

        tabs.forEach(tab => {
            tab.addEventListener('click', () => {
                const method = tab.getAttribute('data-method');

                tabs.forEach(t => t.classList.remove('active'));
                panels.forEach(p => p.classList.remove('active'));

                tab.classList.add('active');
                document.getElementById('panel-' + method).classList.add('active');
                methodInput.value = method;
            });
        });
    </script>

</body>
</html>
