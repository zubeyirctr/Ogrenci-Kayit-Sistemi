public class Course {
    private String courseCode;
    private String courseName;
    private int credit;
    private double grade; // Yeni eklenen: 0-100 arası not

    public Course(String courseCode, String courseName, int credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.grade = 0.0; // Varsayılan not 0
    }
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("HATA: Not 0 ile 100 arasında olmalıdır!");
        }
    }
    public String getLetterGrade() {
        if (grade >= 90) return "AA";
        else if (grade >= 85) return "BA";
        else if (grade >= 80) return "BB";
        else if (grade >= 75) return "CB";
        else if (grade >= 70) return "CC";
        else if (grade >= 60) return "DC";
        else if (grade >= 50) return "DD";
        else return "FF";
    }
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredit() { return credit; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Ders: " + courseName + " [" + courseCode + "] - Kredi: " + credit;
    }
}
