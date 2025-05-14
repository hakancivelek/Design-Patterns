package com.hakancivelek.student.factory;

public class AssociateStudentFactory implements StudentFactory {
    @Override
    public AssociateStudent create(EducationLevel educationLevel) {
        return new AssociateStudent(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(),
                EducationLevel.ASSOCIATE);
    }
}
