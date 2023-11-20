package com.example.demoweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "helloC06Servlet", value = "/home")
public class HelloC06Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        List<String> strings = new ArrayList<>();
//        strings.add("Đề");
//        strings.add("Dân");
//        strings.add("Tiến Anh");
//        response.setContentType("text/html");
//        PrintWriter printWriter = response.getWriter();
//        String str = "";
//        for (String s: s1trings) {
//            str += "<h1>" + s + "</h1>";
//        }
//        printWriter.write(str);

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.write("<form action=\"/home\" method=\"post\">\n" +
                "    <input type=\"text\" name=\"nameUser\">\n" +
                "    <button>Nhấn</button>\n" +
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nameUser");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<h1>" + name + "</h1>");
    }
}

// Tạo một lớp Student (id, name, image) sau đó hiển thị chúng lên web;