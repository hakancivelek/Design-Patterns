package com.hakancivelek.factory;

public class DirectorFactory implements Factory {
    @Override
    public Employee create() {
        Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), "Management", "Management", 5000);
        return director;
    }
}
