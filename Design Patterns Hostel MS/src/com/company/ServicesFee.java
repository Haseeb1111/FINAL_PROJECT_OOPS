package com.company;

public class ServicesFee implements Fee {
    @Override
    public void calculateFee() {
        System.out.println("Your utilities and services bill has been generated!!\n Thank you :)");
    }
}
