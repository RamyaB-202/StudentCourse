public class StudentCourses extends Student {
    private String courseName;
    private int marks;

    public StudentCourses(int rollNumber, String name, String admissionDate, String courseName, int marks) {
        super(rollNumber, name, admissionDate);
        this.courseName = courseName;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Example usage
        StudentCourses mathStudent = new StudentCourses(182, "Ramya Bhat", "2022-09-01", "Math", 90);
        mathStudent.displayStudentInfo();
        mathStudent.displayCourseInfo();

        StudentCourses historyStudent = new StudentCourses(183, "Raven Ruth", "2022-09-01", "History", 85);
        historyStudent.displayStudentInfo();
        historyStudent.displayCourseInfo();
    }
}