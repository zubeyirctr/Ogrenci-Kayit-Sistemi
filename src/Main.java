import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== ÖĞRENCİ YÖNETİM SİSTEMİNE HOŞ GELDİNİZ ===");

        while (running) {
            System.out.println("\n1. Yeni Öğrenci Ekle");
            System.out.println("2. Tüm Öğrencileri Listele");
            System.out.println("3. Öğrenci Ara (ID ile)");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır sonu karakterini temizlemek için

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
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin!");
            }
        }
        scanner.close();
    }
}