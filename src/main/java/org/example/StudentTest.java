package org.example;
import java.util.*;

public class StudentTest {

    public static void main(String[] arg) {
        Student student1 = new Student("what the heack", 100.0, "nothing here");
        Student student2 = new Student("this is a joke", 69.420, "ELon");

        System.out.printf("%s %s 's letter grade is %s %n", student1.getStudentname(), student1.getStudentlastname(), student1.getLetterGrade());
        System.out.printf("%s %s 's letter grade is %s %n", student2.getStudentname(), student2.getStudentlastname(), student2.getLetterGrade());

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number (1-3): %n");
        int pickno = input.nextInt();

        switch (pickno) {
            case 1:
                System.out.printf("You select option One;%n");
                break;
            case 2:
                System.out.printf("You select option Two;%n");
                break;
            case 3:
                System.out.printf("You select option Three;%n");
                break;
            default:
                System.out.printf("You are just out of range%n");
                break;
        }




    }

}
