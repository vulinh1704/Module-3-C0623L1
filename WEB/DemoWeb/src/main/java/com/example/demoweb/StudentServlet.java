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


@WebServlet(name = "studentServlet", value = "/students")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Linh"));
        studentList.add(new Student(2, "Hieu"));
        studentList.add(new Student(3, "Dan"));

        String html = "";
        for (Student s: studentList) {
            html += "<h1>" + s.getId() + " | " + s.getName() + "</h1>";
        }
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(html);
    }
}
