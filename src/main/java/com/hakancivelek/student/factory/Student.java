package com.hakancivelek.student.factory;

import com.hakancivelek.student.EducationLevel;
import com.hakancivelek.student.Faculty;

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

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + faculty + " - " + educationLevel;
    }
}