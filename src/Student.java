import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentId;
    private List<Course> enrolledCourses; // Öğrencinin aldığı derslerin listesi

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>(); // Başlangıçta liste boş
    }

    // Öğrenciye yeni ders ekleyen metod
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Getters
    public String getStudentName() { return studentName; }
    public String getStudentId() { return studentId; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }

    @Override
    public String toString() {
        return "Öğrenci: " + studentName + " (No: " + studentId + ") - Aldığı Ders Sayısı: " + enrolledCourses.size();
    }
}