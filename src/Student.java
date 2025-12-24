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
        if (enrolledCourses.contains(course)) {
            System.out.println("UYARI: " + course.getCourseName() + " dersine zaten kayıtlısınız!");
        } else {
            enrolledCourses.add(course);
            System.out.println("BAŞARILI: " + course.getCourseName() + " eklendi.");
        }
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