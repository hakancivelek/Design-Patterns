package com.hakancivelek.student.factory;

import java.util.Random;

public class StudentRandomizer {
    private static Random random = new Random();

    private static String[] firstNames = {
            "Ahmet", "Ayşe", "Mehmet", "Zeynep", "Burak", "Elif", "Mert", "Deniz", "Selin", "Emre",
            "Nazlı", "Can", "Fatma", "Yusuf", "Buse", "Kemal", "Seda", "Eren", "Gizem", "Halil"
    };

    private static String[] lastNames = {
            "Yılmaz", "Kaya", "Demir", "Çelik", "Aydın", "Şahin", "Öztürk", "Koç", "Arslan", "Doğan"
    };

    private static Faculty[] faculties = Faculty.values();
    private static EducationLevel[] educationLevels = EducationLevel.values();

    public static long createId() {
        return 10000L + random.nextInt(90000);
    }

    public static String createFirstName() {
        return firstNames[random.nextInt(firstNames.length)];
    }

    public static String createLastName() {
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static Faculty createFaculty() {
        return faculties[random.nextInt(faculties.length)];
    }

    public static EducationLevel createEducationLevel() {
        return educationLevels[random.nextInt(educationLevels.length)];
    }
}

