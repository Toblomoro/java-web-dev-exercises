package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String gradeLevel;




    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
  public String getGradeLevel() {
      if (numberOfCredits <= 20 ) {
          return "Freshman";
      }
      if (numberOfCredits <= 40) {
          return "Sophomore";
      }
      if (numberOfCredits <= 60) {
          return "Junior";
      }
      if (numberOfCredits <= 80) {
          return "Senior";
      }


 // Determine the grade level of the student based on numberOfCredits
      return gradeLevel;
 }

    // TODO: Complete the addGrade method.
    public void addGrade(double courseCredits, double grade) {
        //Update the appropriate fields: numberOfCredits, gpa
        //if number of credits is 4 then A, 3 then B, 2 then C, 1 then D, 0 then fail.
        //quality score = (letter grade * course credits) finalGPA = (quality score /total credits
        Double currentQuality = gpa * numberOfCredits;
        Double newCredits = numberOfCredits + courseCredits;
        Double newGpa = gpa + grade;
        Double totalQuality = newGpa * newCredits;


        Double gpa = (totalQuality/newCredits);


      /*  if (gpa >= 3.0) {
            grade = "A";
        }

        if (gpa >= 2.0 || gpa <= 3.0) {
            grade = "B";
        }
        if (gpa >= 1.0 || gpa <= 2.0) {
            grade ="C";
        }
        if (gpa >= 0.0 || gpa <= 1.0) {
            grade = "D";
        }
        if (gpa <= 0.0) {
            grade = "F";
        }*/

        }



    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }



    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }


    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
