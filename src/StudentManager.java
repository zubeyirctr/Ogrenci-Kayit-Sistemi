import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("SİSTEM: " + student.getStudentName() + " başarıyla kaydedildi.");
    }

    public void listAllStudents() {
        System.out.println("\n--- OKUL ÖĞRENCİ LİSTESİ ---");
        for (Student s : students) {
            System.out.println(s.toString() + " | GPA: " + String.format("%.2f", s.calculateGPA()));
        }
    }

    public void findStudentById(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.println("Öğrenci Bulundu: " + s.getStudentName());
                return;
            }
        }
        System.out.println("HATA: " + id + " numaralı öğrenci bulunamadı!");
    }
}