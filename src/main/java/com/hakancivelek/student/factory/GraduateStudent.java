package com.hakancivelek.student.factory;

public class GraduateStudent extends Student {
    public GraduateStudent(Long id, String firstName, String lastName, Faculty faculty, EducationLevel educationLevel) {
        super(id, firstName, lastName, faculty, educationLevel);
    }
}
