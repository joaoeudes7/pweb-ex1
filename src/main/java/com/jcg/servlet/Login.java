package com.jcg.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="Login", description="Login", urlPatterns="/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String senha = request.getParameter("password");

        if (username.equals("joaoeudes7") && senha.equals("hahaha123")) {
            response.sendRedirect("http://localhost:8080/questoes/quest4.html");
        } else {
            response.sendRedirect("http://localhost:8080/questoes/quest6.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
