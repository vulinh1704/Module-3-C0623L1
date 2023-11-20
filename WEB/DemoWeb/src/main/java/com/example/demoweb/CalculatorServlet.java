package com.example.demoweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/cal")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<form action=\"/cal\" method=\"post\">\n" +
                "    <input type=\"number\" placeholder=\"Tien\" name=\"money\">\n" +
                "    <button>Nhan</button>\n" +
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int money = Integer.parseInt(req.getParameter("money"));
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("Money: " + money * 23000);
    }
}
