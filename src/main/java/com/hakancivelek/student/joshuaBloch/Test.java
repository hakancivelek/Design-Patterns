package com.hakancivelek.student.joshuaBloch;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student graduateStudent1 = Student.createGraduateStudent();

        studentList.add(Student.cretaAssociateStudent());
        studentList.add(Student.createDoctorateStudent());
        studentList.add(Student.cretaAssociateStudent());
        studentList.add(Student.createUndergraduateStudent());
        studentList.add(graduateStudent1);

        studentList.forEach(System.out::println);
    }
}
