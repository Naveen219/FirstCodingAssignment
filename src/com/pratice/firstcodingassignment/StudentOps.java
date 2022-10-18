package com.pratice.firstcodingassignment;

import java.util.List;

public interface StudentOps {
    public String addStudent(Student theStudent);
    public String removeStudentById(int theStudentId);
    public List<Student> returnAllStudents();
    public Student searchStudentById(int theStudentId);
}
