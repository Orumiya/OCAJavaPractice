package com.company;

import methods.Customer;
import methods.Shirt;

public class Main {

    public static void main(String[] args) {
	 String[] clothes = {"pants", "shirt", "gloves"};
	 String movies[] = new String[4];
	 movies[0] = "Inception";
	 movies[1] = "Harry Potter";

        for (String item : clothes) {
            System.out.println(item);
        }
        clothes[0] = clothes[1];
        System.out.println(clothes[0]);


        //*************************** CREATING AND USING METHODS **************************************
    // show();
        Shirt shirt = new Shirt(4444, "white shirt");
        shirt.itemNo = 2222;
        shirt.name = "black shirt";
        // shirt.display();
        Shirt shirt2 = new Shirt(333, "yellow shirt");
        System.out.println("how many shirts do we have?" + Shirt.howManyShirtsDoWeHave());

        Customer cust = new Customer(true, "Mary White", 34);
       // System.out.println(cust.customerName);

    }

    //*************************** CREATING AND USING METHODS **************************************
    public static void show() {
        System.out.println("method");
    }
}
