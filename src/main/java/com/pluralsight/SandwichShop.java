package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("Please select what size loaf you would like");
        double Regular_base_price = 5.45;
        double Large_base_price = 8.95;
        System.out.println("Regular: base price $" + Regular_base_price);
        System.out.println("Large: base price $" + Large_base_price);
        String Sandwich_size = scanner.next();
        double Regular_student_discount = Regular_base_price * 0.10;
        double Regular_senior_discount = Regular_base_price * 0.20;
        double Large_student_discount = Large_base_price * 0.10;
        double Large_senior_discount = Large_base_price * 0.20;
        if (Sandwich_size.equalsIgnoreCase("Regular") ){
            System.out.println("Would you like a loaded sandwich? (yes/no)");
            String loaded = scanner.next();
            if (loaded.equalsIgnoreCase("yes")){
                Regular_base_price = Regular_base_price + 1.00;
            }
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            if (age <= 17){
                Regular_base_price = Regular_student_discount - Regular_base_price;
                System.out.printf("The price is $ %.2f", Math.abs(Regular_base_price + 1.00));
            }
            else if (age >= 65){
                Regular_base_price = Regular_senior_discount - Regular_base_price;
                System.out.printf("The price is $ %.2f", Math.abs(Regular_base_price+ 1.00));
            }
            else {
                System.out.printf("The price is $ %.2f", Math.abs(Regular_base_price+ 1.00));
            }

        }
        else if (Sandwich_size.equalsIgnoreCase("Large")) {
            System.out.println("Would you like a loaded sandwich? (yes/no)");
            String loaded = scanner.next();
            if (loaded.equalsIgnoreCase("yes")){
                Large_base_price = Large_base_price + 1.75;
            }
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            if (age <= 17){
                Large_base_price = Large_student_discount - Large_base_price;
                System.out.printf("The price is $ %.2f", Math.abs(Large_base_price));
            }
            else if (age >= 65){
                Large_base_price = Large_senior_discount - Large_base_price;
                System.out.printf("The price is $ %.2f", Math.abs(Large_base_price));
            }
            else {
                System.out.printf("The price is $ %.2f", Math.abs(Large_base_price));
            }
        }

    }
}
