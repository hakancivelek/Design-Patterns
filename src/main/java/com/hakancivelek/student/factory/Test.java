package com.hakancivelek.student.factory;

import java.awt.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        AssociateStudentFactory associateStudentFactory = new AssociateStudentFactory();
        DoctorateStudentFactory doctorateStudentFactory = new DoctorateStudentFactory();
        GraduateStudentFactory graduateStudentFactory = new GraduateStudentFactory();
        UndergraduateStudentFactory undergraduateStudentFactory = new UndergraduateStudentFactory();

        studentList.add(associateStudentFactory.create(EducationLevel.ASSOCIATE));
        studentList.add(doctorateStudentFactory.create(EducationLevel.DOCTORATE));
        studentList.add(associateStudentFactory.create(EducationLevel.ASSOCIATE));
        studentList.add(undergraduateStudentFactory.create(EducationLevel.UNDERGRADUATE));
        studentList.add(graduateStudentFactory.create(EducationLevel.GRADUATE));

        studentList.forEach(System.out::println);
    }
}
