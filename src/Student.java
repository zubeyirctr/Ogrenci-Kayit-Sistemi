import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentId;
    private List<Course> enrolledCourses;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (enrolledCourses.contains(course)) {
            System.out.println("UYARI: " + course.getCourseName() + " dersine zaten kayıtlısınız!");
        } else {
            enrolledCourses.add(course);
            System.out.println("BAŞARILI: " + course.getCourseName() + " eklendi.");
        }
    }
    public double calculateGPA() {
        if (enrolledCourses.isEmpty()) return 0.0;

        double totalPoints = 0;
        int totalCredits = 0;

        for (Course course : enrolledCourses) {
            totalPoints += (course.getGrade() * course.getCredit());
            totalCredits += course.getCredit();
        }

        return totalPoints / totalCredits;
    }
    public String getStudentName() { return studentName; }
    public String getStudentId() { return studentId; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }

    @Override
    public String toString() {
        return "Öğrenci: " + studentName + " (No: " + studentId + ") - Aldığı Ders Sayısı: " + enrolledCourses.size();
    }
}