package com.practice.firstcodingassignment;



import java.util.List;
import java.util.Scanner;

public class MenuDrivenApplication {
    public static void main(String[] args) {
        StudentOps studentOps = new StudentOpsImpl();
        Scanner input= new Scanner(System.in);
        int id;
        String name;
        boolean runningFlag = true;
        System.out.println("Select any of the following operations");
        do {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display students");
            System.out.println("4. Search student");
            System.out.println("5. Exit");
            int operation = input.nextInt();
            switch(operation) {
                case 1:
                    System.out.println("Enter student's Id: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter student's name");
                    name = input.nextLine();
                    Student student = new Student(id, name);
                    System.out.println(studentOps.addStudent(student));
                    break;
                case 2:
                    System.out.println("Enter the id of the student to be removed");
                    id = input.nextInt();
                    System.out.println(studentOps.removeStudentById(id));
                    break;
                case 3:
                    List<Student> studentList = studentOps.returnAllStudents();
                    studentList.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Enter the id of the student to be searched");
                    id = input.nextInt();
                    Student tempStudent = studentOps.searchStudentById(id);
                    if (tempStudent != null) {
                        System.out.println("Student of the given id exists in the list");
                    }
                    else {
                        System.out.println("Student of the given id doesn't exist in the list");
                    }
                    break;
                case 5:
                    runningFlag = false;
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }while(runningFlag);
    }
}
