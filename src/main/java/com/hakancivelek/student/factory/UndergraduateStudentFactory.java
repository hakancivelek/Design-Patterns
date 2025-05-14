package com.hakancivelek.student.factory;

public class UndergraduateStudentFactory implements StudentFactory {
    @Override
    public UndergraduateStudent create(EducationLevel educationLevel) {
        return new UndergraduateStudent(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(),
                EducationLevel.UNDERGRADUATE);
    }
}
