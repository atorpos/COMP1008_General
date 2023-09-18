package org.example;

public class StudentTest {

    public static void main(String[] arg) {
        Student student1 = new Student("what the heack", 100.0, "nothing here");
        Student student2 = new Student("this is a joke", 69.420, "ELon");

        System.out.printf("%s 's letter grade is %s %n", student1.getStudentname(), student1.getLetterGrade());
        System.out.printf("%s 's letter grade is %s %n", student2.getStudentname(), student2.getLetterGrade());

    }

}
