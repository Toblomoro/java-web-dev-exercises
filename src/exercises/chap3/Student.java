package exercises.chap3;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {


    public static String name = "Ben Voges";

    private int studentId = 123456789;
    private int numberOfCredits = 1;
    private double gpa = 4.0;


    public Student(String name, int studentId, int getNumberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = getNumberOfCredits;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}






