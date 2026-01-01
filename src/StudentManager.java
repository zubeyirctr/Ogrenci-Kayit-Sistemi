import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }
    public void saveStudentsToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("ogrenciler.txt"))) {
            for (Student s : students) {
                writer.println(s.getStudentName() + "," + s.getStudentId() + "," + s.calculateGPA());
            }
            System.out.println("SİSTEM: Tüm veriler 'ogrenciler.txt' dosyasına başarıyla yedeklendi!");
        } catch (IOException e) {
            System.out.println("HATA: Dosyaya yazılırken bir sorun oluştu: " + e.getMessage());
        }
    }
    public void addGradeToStudent(String id, String courseName, double grade) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                Course newCourse = new Course(courseName, courseName, 3);
                newCourse.setGrade(grade);
                s.addCourse(newCourse);
                System.out.println("SİSTEM: " + s.getStudentName() + " isimli öğrenciye " + courseName + " notu girildi.");
                return;
            }
        }
        System.out.println("HATA: Öğrenci bulunamadı!");
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
    public void loadStudentsFromFile() {
        File file = new File("ogrenciler.txt");
        if (!file.exists()) return; // Dosya yoksa hata verme, boş geç

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {

                    Student s = new Student(parts[0], parts[1]);
                    students.add(s);
                }
            }
            System.out.println("SİSTEM: Eski veriler başarıyla yüklendi.");
        } catch (IOException e) {
            System.out.println("HATA: Dosya okunurken sorun oluştu!");
        }
    }
}