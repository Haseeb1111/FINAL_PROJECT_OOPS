package com.company;

public class Hostel {
    private static Hostel hostel = new Hostel();

    private Hostel() {

    }

    public static Hostel getInstance() {
        return hostel;
    }

    public void printMenu() {
        System.out.println("WELCOME TO HOSTEL MANAGEMENT SYSTEM");
        System.out.println("1. Register Hostel");
        System.out.println("2. Add Food facilities");
        System.out.println("3. Generate total hostel bill");
        System.out.println("4. Exit");
    }

    public void registerHostel(String type) {
        HostelFactory hostelFactory = new HostelFactory();
        HostelType hostelType = hostelFactory.getInstance(type);
        hostelType.registerHostel();
    }

    public void addFoodFacility(String type) {

        if (type.equals("breakfast")) {
            Context context = new Context(new BreakfastFood());
            context.addFoodFacility();
        }
        if (type.equals("lunch")) {
            Context context = new Context(new LunchFood());
            context.addFoodFacility();
        }
        if (type.equals("dinner")) {
            Context context = new Context(new DinnerFood());
            context.addFoodFacility();
        }
    }

    public void generateBill(String type) {
        FeeCalculator feeCalculator = new FeeCalculator();
        if (type.equals("service")) {
            feeCalculator.generateServicesFee();
        } else {
            feeCalculator.generateRoomsFee();
        }
    }

}
