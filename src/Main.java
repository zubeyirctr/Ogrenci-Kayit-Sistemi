public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java 101", "CS101", 5);
        Course dbCourse = new Course("Veritabanı Yönetimi", "CS202", 4);

        Student zubeyir = new Student("Zübeyir Çatar", "2024001");

        System.out.println("--- 7. GÜN: NOT SİSTEMİ VE GPA HESAPLAMA ---\n");

        zubeyir.enrollInCourse(javaCourse);
        zubeyir.enrollInCourse(dbCourse);

        javaCourse.setGrade(85.0);
        dbCourse.setGrade(70.0);

        System.out.println("\n--- ÖĞRENCİ DURUMU ---");
        System.out.println(zubeyir.toString());

        System.out.println("\n--- DERS LİSTESİ VE NOTLAR ---");
        for (Course c : zubeyir.getEnrolledCourses()) {
            System.out.println("- " + c.getCourseName() +
                    " [" + c.getCourseCode() + "] " +
                    "| Kredi: " + c.getCredit() +
                    " | Not: " + c.getGrade());
        }

        double gpa = zubeyir.calculateGPA();
        System.out.println("\n------------------------------");
        System.out.printf("GENEL NOT ORTALAMASI: %.2f\n", gpa);
        System.out.println("------------------------------");
    }
}
