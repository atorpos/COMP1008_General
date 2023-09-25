//Student Number: 200561852
//Student Name: Sun Fai Oskar Wong
//Course: COMP1008 -200
//Assignment 1, Exercice 2

package org.example.exercice2;

public class test2 {
    public static void main(String[] arg) {
        Employee employee1 = new Employee("Connor", "McDavid", 12999);
        Employee employee2 = new Employee("Austin", "Matthew", 14999);
        System.out.println("__________________________________________________________________________________");
        System.out.println("|  First Name  |  Last Name  | Monthly Salary | Yearly Salary | Next Year Salary |");
        System.out.println("__________________________________________________________________________________");
        System.out.printf("|%14s|%13s|%16.2f|%15.2f|%18.2f|%n", employee1.getFirst_name(), employee1.getLast_name(), employee1.getMonth_salary(), employee1.getMonth_salary()*12, employee1.salarybump());
        System.out.printf("|%14s|%13s|%16.2f|%15.2f|%18.2f|%n", employee2.getFirst_name(), employee2.getLast_name(), employee2.getMonth_salary(), employee2.getMonth_salary()*12, employee2.salarybump());
        System.out.println("__________________________________________________________________________________");
    }
}
