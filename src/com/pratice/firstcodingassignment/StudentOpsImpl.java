package com.pratice.firstcodingassignment;

import com.sun.corba.se.spi.presentation.rmi.PresentationManager;

import java.util.ArrayList;
import java.util.List;

public class StudentOpsImpl implements StudentOps {
    private List<Student> studentList;
    public StudentOpsImpl() {
        studentList = new ArrayList<>();
    }
    @Override
    public String addStudent(Student theStudent) {
        if (studentList.add(theStudent)) {
            return "added successfully";
        }
        return "cannot be added";
    }

    @Override
    public String removeStudentById(int theStudentId) {
        Student tempStudent = searchStudentById((theStudentId));
        if (tempStudent != null) {
            studentList.remove(tempStudent);
            return "remove successfully";
        }
        return "cannot be removed";
    }

    @Override
    public List<Student> returnAllStudents() {
        return this.studentList;
    }

    @Override
    public Student searchStudentById(int theStudentId) {
        for (Student tempStudent : this.studentList) {
            if (tempStudent.getId() == theStudentId) {
                return tempStudent;
            }
        }
        return null;
    }

}
