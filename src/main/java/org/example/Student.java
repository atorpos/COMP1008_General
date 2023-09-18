package org.example;

public class Student {
    String studentname;
    double studentavaerage;
    public double getStudentavaerage() {
        return studentavaerage;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentavaerage(double studentavaerage) {
        this.studentavaerage = studentavaerage;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getLetterGrade(double studentaverage) {
        String studentgrade;
        if (studentaverage >= 80) {
            studentgrade = "A";
        } else if (studentaverage >= 70) {
            studentgrade = "B";
        } else if (studentaverage >=60) {
            studentgrade = "C";
        } else if (studentaverage >= 50) {
            studentgrade = "D";
        } else {
            studentgrade = "F";
        }
        return studentgrade;
    }

}
