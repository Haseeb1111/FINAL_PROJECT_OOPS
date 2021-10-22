package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {



    @Test
    public void hostelFactoryTest(){
        HostelFactory factory=new HostelFactory();
        HostelType type=factory.getInstance("male");

        assertTrue(type instanceof MaleHostel);
    }

    @Test
    public void hostelSingletonTest(){
        Hostel h1=Hostel.getInstance();
        Hostel h2=Hostel.getInstance();

        assertEquals(h1,h2);
    }

}
