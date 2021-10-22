package com.company;

public class HostelFactory {
    public HostelType getInstance(String type){
        if(type.equals("male")){
            return new MaleHostel();
        }else{
            return new FemaleHostel();
        }
    }
}
