public class Course {
    private String courseCode;
    private String courseName;
    private int credit;

    public Course(String courseCode, String courseName, int credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
    }

    // Getters
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredit() { return credit; }

    @Override
    public String toString() {
        return "Ders: " + courseName + " [" + courseCode + "] - Kredi: " + credit;
    }
}
