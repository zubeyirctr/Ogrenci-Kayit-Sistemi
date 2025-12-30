import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }
    public void saveStudentsToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("ogrenciler.txt"))) {
            for (Student s : students) {
                // Ad, ID ve GPA bilgilerini satır satır yazıyoruz
                writer.println(s.getStudentName() + "," + s.getStudentId() + "," + s.calculateGPA());
            }
            System.out.println("SİSTEM: Tüm veriler 'ogrenciler.txt' dosyasına başarıyla yedeklendi!");
        } catch (IOException e) {
            System.out.println("HATA: Dosyaya yazılırken bir sorun oluştu: " + e.getMessage());
        }
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