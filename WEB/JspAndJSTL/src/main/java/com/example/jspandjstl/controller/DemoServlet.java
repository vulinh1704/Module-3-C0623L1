package com.example.jspandjstl.controller;

import com.example.jspandjstl.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "demoServlet", value = "/home")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        String name = "Linh";
//        req.setAttribute("nameStudent", name);
//        String name = "Abc";
//        req.setAttribute("name", name);


        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Daan"));
        list.add(new Student(2, "De"));
        list.add(new Student(3, "Linh"));
        req.setAttribute("list", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
        dispatcher.forward(req, resp);
    }
}
