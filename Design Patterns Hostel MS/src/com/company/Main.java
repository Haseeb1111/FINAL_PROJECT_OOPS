package com.company;

// Hostel Management System
//Singleton ✅
//Factory ✅
//Strategy ✅
//Facade ✅

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hostel hostel = Hostel.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            hostel.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                //Register hostel
                System.out.println("Register hostel for male or female ?");
                System.out.println("1. Male hostel registration");
                System.out.println("2. Female hostel registration");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    hostel.registerHostel("male");
                } else {
                    hostel.registerHostel("female");
                }
            }
            if (option == 2) {
                int selection = 0;
                boolean isBreakfastAdded = false;
                boolean isLunchAdded = false;
                boolean isDinnerAdded = false;
                while (selection != 4) {
                    System.out.println("Select food facilities you want to add in your hostel room ?");
                    System.out.println("1. Breakfast");
                    System.out.println("2. Lunch");
                    System.out.println("3. Dinner");
                    System.out.println("4. Exit");
                    input = sc.nextLine();
                    selection = Integer.parseInt(input);
                    if (selection == 1) {
                        if (isBreakfastAdded) {
                            System.out.println("Breakfast facility has already been added!");
                        } else {
                            hostel.addFoodFacility("breakfast");
                            isBreakfastAdded = true;
                        }
                    }
                    if (selection == 2) {
                        if (isLunchAdded) {
                            System.out.println("Lunch facility has already been added!");
                        } else {
                            hostel.addFoodFacility("lunch");
                            isLunchAdded = true;
                        }

                    }
                    if (selection == 3) {
                        if (isDinnerAdded) {
                            System.out.println("Dinner has already been added to your food facilities!");
                        } else {
                            hostel.addFoodFacility("dinner");
                            isDinnerAdded = true;
                        }

                    }
                }

            }
            if (option == 3) {
                //generate hostel bill
                System.out.println("Which bill ?");
                System.out.println("1. Utilities and services bill");
                System.out.println("2. Check out - Room total bill");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    hostel.generateBill("service");
                } else {
                    hostel.generateBill("room");
                }

            }
            if (option == 4) {
                System.out.println("Thanks for visiting our hostel! :)");
            }

        }
    }
}
