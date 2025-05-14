package com.hakancivelek.student.factory;

public class GraduateStudentFactory implements StudentFactory {
    @Override
    public GraduateStudent create(EducationLevel educationLevel) {
        return new GraduateStudent(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(),
                EducationLevel.GRADUATE);
    }
}
