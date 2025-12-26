public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("CS101", "Java 101", 5);
        Course dbCourse = new Course("CS202", "Veritabanı Yönetimi", 4);

        Student zubeyir = new Student("Zübeyir Çatar", "2024001");

        System.out.println("--- 8. GÜN: HARF NOTU VE AKADEMİK DURUM ---\n");

        zubeyir.enrollInCourse(javaCourse);
        zubeyir.enrollInCourse(dbCourse);

        
        javaCourse.setGrade(88.0);
        dbCourse.setGrade(45.0);

        System.out.println("\n--- GÜNCEL KARNE ---");
        System.out.println(zubeyir.toString());

        for (Course c : zubeyir.getEnrolledCourses()) {
            System.out.println("- " + c.getCourseName() +
                    " | Not: " + c.getGrade() +
                    " | Harf: " + c.getLetterGrade());
        }

        System.out.println("\n------------------------------");
        System.out.printf("GENEL NOT ORTALAMASI: %.2f\n", zubeyir.calculateGPA());
        System.out.println("AKADEMİK DURUM: " + zubeyir.getAcademicStatus());
        System.out.println("------------------------------");
    }
}
