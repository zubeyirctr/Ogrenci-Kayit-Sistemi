public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student("Zübeyir Çatar", "2024001");
        Student s2 = new Student("Ahmet Yılmaz", "2024002");
        Student s3 = new Student("Ayşe Demir", "2024003");

        Course java = new Course("CS101", "Java 101", 5);
        java.setGrade(90);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        s1.enrollInCourse(java);

        manager.listAllStudents();

        System.out.println("\n--- Arama Testi ---");
        manager.findStudentById("2024001");
        manager.findStudentById("9999999"); // Bulunamayacak olan
    }
}