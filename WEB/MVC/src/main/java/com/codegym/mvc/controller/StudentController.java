package com.codegym.mvc.controller;

import com.codegym.mvc.model.Student;
import com.codegym.mvc.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentController", value = "/students")
public class StudentController extends HttpServlet {
    private StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "findAll":
                showHome(req, resp);
                break;
            case "create":
                showFormAdd(req, resp);
                break;
            case "delete":
                showFormDelete(req, resp);
        }

    }

    public void showFormDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("student/delete.jsp");
        int idDelete = Integer.parseInt(req.getParameter("id"));
        Student student = studentService.getStudent(idDelete);
        req.setAttribute("student", student);
        dispatcher.forward(req, resp);
    }

    public void showFormAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("student/add.jsp");
        dispatcher.forward(req, resp);
    }

    public void showHome(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.findAll();
        RequestDispatcher dispatcher = req.getRequestDispatcher("student/home.jsp");
        req.setAttribute("studentList", studentList);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "create":
                addStudent(req, resp);
                break;
            case "edit":
                break;
            case "delete":
               deleteStudent(req, resp);
               break;
        }

    }

    public void deleteStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(req.getParameter("id"));
        int idDelete = Integer.parseInt(req.getParameter("id"));
        studentService.delete(idDelete);
        resp.sendRedirect("/students?action=findAll");
    }
    public void addStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        Student student = new Student(name, image);
        studentService.add(student);
        resp.sendRedirect("/students?action=findAll");
    }
}
