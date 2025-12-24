public class Main {
    public static void main(String[] args) {
        // 1. Dersleri tanımlayalım
        Course javaCourse = new Course("Java 101", "CS101", 5);
        Course dbCourse = new Course("Veritabanı Yönetimi", "CS202", 4);

        // 2. Öğrenciyi tanımlayalım
        Student zubeyir = new Student("Zübeyir Çatar", "2024001");

        System.out.println("--- Kayıt Sistemi Başlatıldı ---\n");

        // 3. Normal kayıt işlemleri
        zubeyir.enrollInCourse(javaCourse);
        zubeyir.enrollInCourse(dbCourse);

        // 4. TEST: Aynı dersi tekrar eklemeyi deniyoruz (Bugün eklediğimiz özellik)
        System.out.println("\n--- Test: Aynı Dersi Tekrar Ekleme ---");
        zubeyir.enrollInCourse(javaCourse);

        // 5. Sonuçları listeleme
        System.out.println("\n--- Öğrenci Bilgileri ---");
        System.out.println(zubeyir.toString());
        System.out.println("Kayıtlı Toplam Ders Sayısı: " + zubeyir.getEnrolledCourses().size());

        System.out.println("\nDers Listesi:");
        for (Course c : zubeyir.getEnrolledCourses()) {
            System.out.println("- " + c.getCourseCode() + " : " + c.getCourseName());
        }
    }
}
