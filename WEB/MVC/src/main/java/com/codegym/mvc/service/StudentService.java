package com.codegym.mvc.service;

import com.codegym.mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IService<Student> {
    private List<Student> studentList = new ArrayList<>();

    public StudentService() {
        studentList.add(new Student(1, "Đề", "https://leplateau.edu.vn/wp-content/uploads/2023/10/hinh-anh-con-gai-1.jpg"));
        studentList.add(new Student(2, "Dân", "https://yt3.googleusercontent.com/inhxgLbhHuXL6IllrpCH9jw7jdb0aQLv4hpVdATYsBGJAwFYs8OpuvBKnKz-8M2eHp1oXvoyIQ=s900-c-k-c0x00ffffff-no-rj"));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        studentList.set(index, student);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        studentList.remove(index);
    }

    @Override
    public List<Student> findAll() {
        return this.studentList;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public Student getStudent(int id) {
        int index = findById(id);
        return studentList.get(index);
    }
}
