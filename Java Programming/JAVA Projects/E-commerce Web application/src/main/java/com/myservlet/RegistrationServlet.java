package com.myservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegistrationServlet extends HttpServlet {

    Connection con;
    PreparedStatement pst;

    public void init() {
        con = (Connection) getServletContext().getAttribute("dbcon");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sq = request.getParameter("sq");
        String sa = request.getParameter("sa");

        try {

            if (con == null) {
                out.println("<h2>Database connection is null!</h2>");
                return;
            }

            pst = con.prepareStatement(
                "INSERT INTO user (username, password, securityQuestion, securityAnswer) VALUES (?, ?, ?, ?)"
            );

            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, sq);
            pst.setString(4, sa);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                out.println("<h2>Registration Successful! Welcome, " + username + "!</h2>");
                out.println("<a href='SignIn.html'>Click here to Login</a>");
            } else {
                out.println("<h2>Registration Failed. Try again.</h2>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        }
    }

    public void destroy() {
        try {
            if (pst != null) pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}