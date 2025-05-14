package com.hakancivelek.student.factory;

public class AssociateStudent extends Student {
    public AssociateStudent(Long id, String firstName, String lastName, Faculty faculty, EducationLevel educationLevel) {
        super(id, firstName, lastName, faculty, educationLevel);
    }
}
