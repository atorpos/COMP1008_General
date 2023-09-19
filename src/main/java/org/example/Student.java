package org.example;

public class Student {
//    usually the variables are private;
    private String studentname;

    private String studentlastname;
    private double studentavaerage;


//   init the variables, for user input as well
    public Student(String studentname, double studentavaerage, String lastname) {
        this.studentname = studentname;
        this.studentlastname = lastname;

        if(studentavaerage >= 0.0 && studentavaerage <= 100.0) {
            this.studentavaerage = studentavaerage;
        }
    }
    public double getStudentavaerage() {
        return studentavaerage;
    }

    public String getStudentlastname() {
        return studentlastname;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentavaerage(double studentavaerage) {
        if(studentavaerage > 0.0 && studentavaerage < 100.0) {
            this.studentavaerage = studentavaerage;
        }
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentlastname(String studentlastname) {
        this.studentlastname = studentlastname;
    }
    public String getLetterGrade() {
        String studentgrade = "";
        if (studentavaerage >= 90.0) {
            studentgrade = "A";
        } else if (studentavaerage >= 80.0) {
            studentgrade = "B";
        } else if (studentavaerage >=70.0) {
            studentgrade = "C";
        } else if (studentavaerage >= 60.0) {
            studentgrade = "D";
        } else {
            studentgrade = "F";
        }
        return studentgrade;
    }

}
