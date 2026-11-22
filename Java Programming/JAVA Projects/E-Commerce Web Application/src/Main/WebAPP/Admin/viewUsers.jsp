<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myservlet.model.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Users</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }

        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }

        .page-header {
            max-width: 900px;
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
            max-width: 900px;
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

        .role-badge {
            display: inline-block;
            padding: 4px 12px;
            border-radius: 999px;
            font-size: 0.72rem;
            font-weight: 700;
            text-transform: uppercase;
        }

        .role-ADMIN { background: #eef1ff; color: #5468d4; }
        .role-CUSTOMER { background: #e5f8ee; color: #2e8b57; }

        .empty-row td { text-align: center; color: #999; padding: 30px; }
    </style>
</head>
<body>

    <div class="page-header">
        <h1>Registered Users</h1>
        <div class="header-links">
            <a href="dashboard">Dashboard</a>
            <a href="../logout.jsp">Logout</a>
        </div>
    </div>

    <div class="table-card">
        <table>
            <tr>
                <th>Username</th>
                <th>Security Question</th>
                <th>Role</th>
            </tr>
            <%
                @SuppressWarnings("unchecked")
                List<User> users = (List<User>) request.getAttribute("users");
            %>
            <% if (users == null || users.isEmpty()) { %>
                <tr class="empty-row"><td colspan="3">No registered users yet.</td></tr>
            <% } else { %>
                <% for (User u : users) { %>
                    <tr>
                        <td><%= u.getUsername() %></td>
                        <td><%= u.getSecurityQuestion() %></td>
                        <td><span class="role-badge role-<%= u.getRole() %>"><%= u.getRole() %></span></td>
                    </tr>
                <% } %>
            <% } %>
        </table>
    </div>

</body>
</html>
