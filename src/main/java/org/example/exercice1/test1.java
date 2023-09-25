//Student Number: 200561852
//Student Name: Sun Fai Oskar Wong
//Course: COMP1008 -200
//Assignment 1, Exercice 1

package org.example.exercice1;

public class test1 {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("EP123456", "the new ear phone", 3, 24.99);
        System.out.println("___________________________________________________________________");
        System.out.println("|   SKU    |   Description      | Quantity |   Price  | Sub-Total |");
        System.out.println("___________________________________________________________________");
        System.out.printf("|%10s|%20s|%10s|%10s|%11s|%n", invoice1.getPart_number(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getProduct_price(), invoice1.getInvoiceAmount());
        System.out.println("___________________________________________________________________");
    }
}
