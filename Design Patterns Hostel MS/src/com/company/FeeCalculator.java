package com.company;

public class FeeCalculator {
    private ServicesFee servicesFee;
    private RoomFee roomFee;

    public FeeCalculator() {
        servicesFee = new ServicesFee();
        roomFee = new RoomFee();
    }

    public void generateServicesFee() {
        servicesFee.calculateFee();
    }

    public void generateRoomsFee() {
        roomFee.calculateFee();
    }
}
