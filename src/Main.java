public class Main {
    public static void main(String[] args) {
        // 1. Önce derslerimizi oluşturalım
        Course javaCourse = new Course("Java 101", "CS101", 5);
        Course dbCourse = new Course("Veritabanı Yönetimi", "CS202", 4);

        // 2. Bir öğrenci oluşturalım (Tabii ki sen!)
        Student zubeyir = new Student("Zübeyir Çatar", "2024001");

        // 3. Öğrenciye derslerini ekleyelim (Kayıt yapıyoruz)
        zubeyir.enrollInCourse(javaCourse);
        zubeyir.enrollInCourse(dbCourse);

        // 4. Sonucu ekrana yazdıralım
        System.out.println("--- Öğrenci Kayıt Sistemi ---");
        System.out.println(zubeyir.toString());

        System.out.println("\nAldığı Dersler:");
        for (Course c : zubeyir.getEnrolledCourses()) {
            System.out.println("- " + c.getCourseName() + " (" + c.getCourseCode() + ")");
        }
    }
}
