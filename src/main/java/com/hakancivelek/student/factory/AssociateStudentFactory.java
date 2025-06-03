package com.hakancivelek.student.factory;

import com.hakancivelek.student.EducationLevel;
import com.hakancivelek.student.StudentRandomizer;

public class AssociateStudentFactory implements StudentFactory {
    @Override
    public Student create(EducationLevel educationLevel) {
        return new Student(StudentRandomizer.createId(), StudentRandomizer.createFirstName(),
                StudentRandomizer.createLastName(), StudentRandomizer.createFaculty(),
                EducationLevel.ASSOCIATE);
    }
}
