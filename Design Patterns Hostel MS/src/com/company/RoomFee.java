package com.company;

public class RoomFee implements Fee {
    @Override
    public void calculateFee() {
        System.out.println("Your Room total stay bill has been generated! Thank you for your stay :)");
    }
}
