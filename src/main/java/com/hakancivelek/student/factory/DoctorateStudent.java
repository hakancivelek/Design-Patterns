package com.hakancivelek.student.factory;

public class DoctorateStudent extends Student {
    public DoctorateStudent(Long id, String firstName, String lastName, Faculty faculty, EducationLevel educationLevel) {
        super(id, firstName, lastName, faculty, educationLevel);
    }
}
