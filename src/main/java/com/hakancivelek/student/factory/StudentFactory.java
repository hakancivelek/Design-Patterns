package com.hakancivelek.student.factory;

import com.hakancivelek.student.EducationLevel;

public interface StudentFactory {
    Student create(EducationLevel educationLevel);
}
