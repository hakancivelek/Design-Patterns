package com.hakancivelek.student.factory;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent(Long id, String firstName, String lastName, Faculty faculty, EducationLevel educationLevel) {
        super(id, firstName, lastName, faculty, educationLevel);
    }
}
