package com.hakancivelek.student.factory;

public class DoctorateStudentFactory implements StudentFactory {
    @Override
    public DoctorateStudent create(EducationLevel educationLevel) {
        return new DoctorateStudent(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(),
                EducationLevel.DOCTORATE);
    }
}
