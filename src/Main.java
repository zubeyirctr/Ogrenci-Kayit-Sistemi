import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.loadStudentsFromFile();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== ÖĞRENCİ YÖNETİM SİSTEMİNE HOŞ GELDİNİZ ===");

        while (running) {
            System.out.println("\n1. Yeni Öğrenci Ekle");
            System.out.println("2. Tüm Öğrencileri Listele");
            System.out.println("3. Öğrenci Ara (ID ile)");
            System.out.println("4. Çıkış");
            System.out.println("5. Verileri Dosyaya Yedekle");
            System.out.println("6. Öğrenciye Not Gir");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Öğrenci Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Öğrenci No: ");
                    String id = scanner.nextLine();
                    manager.addStudent(new Student(name, id));
                    break;
                case 2:
                    manager.listAllStudents();
                    break;
                case 3:
                    System.out.print("Aranacak ID: ");
                    String searchId = scanner.nextLine();
                    manager.findStudentById(searchId);
                    break;
                case 4:
                    running = false;
                    System.out.println("Sistemden çıkılıyor... İyi günler!");
                    break;
                case 5:
                    manager.saveStudentsToFile();
                    break;
                case 6:
                    System.out.print("Not girilecek Öğrenci ID: ");
                    String targetId = scanner.nextLine();
                    System.out.print("Ders Adı: ");
                    String course = scanner.nextLine();
                    System.out.print("Notu (0-100): ");
                    double score = scanner.nextDouble();
                    scanner.nextLine(); // Boşluk temizliği

                    manager.addGradeToStudent(targetId, course, score);
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin!");
            }
        }
        scanner.close();
    }
}