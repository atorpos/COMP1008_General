//Student Number: 200561852
//Student Name: Sun Fai Oskar Wong
//Course: COMP1008 -200
//Assignment 1, Exercice 1

package org.example.exercice1;

public class Invoice {

//    private int invoice_number;

    private String part_number;

    private String description;

    private int quantity;

    private double product_price;

    public Invoice(String part_number, String description, int quantity, double product_price) {
        this.part_number = part_number;
        this.description = description;
        this.quantity = quantity;
        if(product_price > 0.0) {
            this.product_price = product_price;
        }
    }

    public String getPart_number() {
        return part_number;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public double getInvoiceAmount() {
        double subamount = 0.0;
        if(quantity > 0 && product_price > 0.0) {
            subamount = quantity * product_price;
        }
        return subamount;
    }
}
