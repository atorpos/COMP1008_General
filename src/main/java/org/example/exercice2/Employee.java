//Student Number: 200561852
//Student Name: Sun Fai Oskar Wong
//Course: COMP1008 -200
//Assignment 1, Exercice 2

package org.example.exercice2;

public class Employee {

    private String first_name;

    private String last_name;

    private double month_salary;

    public Employee(String first_name, String last_name, double month_salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.month_salary = month_salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getMonth_salary() {
        return month_salary;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMonth_salary(double month_salary) {

        if(month_salary > 0) {
            this.month_salary = month_salary;
        }
    }
    public double salarybump() {
        double bumprate = 0.1;
        double salarybump = 0.0;

        salarybump = this.month_salary*(1+bumprate)*12;

        return salarybump;
    }


}
