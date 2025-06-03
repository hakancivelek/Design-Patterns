package com.hakancivelek.student.joshuaBloch;

import com.hakancivelek.student.EducationLevel;
import com.hakancivelek.student.Faculty;
import com.hakancivelek.student.StudentRandomizer;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Faculty faculty;
    private EducationLevel educationLevel;

    public Student(Long id, String firstName, String lastName, Faculty faculty, EducationLevel educationLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.educationLevel = educationLevel;
    }

    public static Student cretaAssociateStudent() {
        return new Student(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(), EducationLevel.ASSOCIATE);
    }

    public static Student createDoctorateStudent() {
        return new Student(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(), EducationLevel.DOCTORATE);
    }

    public static Student createGraduateStudent() {
        return new Student(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(), EducationLevel.GRADUATE);
    }

    public static Student createUndergraduateStudent() {
        return new Student(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(), EducationLevel.UNDERGRADUATE);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + faculty + " - " + educationLevel;
    }
}
