package com.stackroute.bulb;

public class Fan implements ElectricAppliance{


    @Override
    public void on() {
        System.out.println("I'm rotating");
    }

    @Override
    public void off() {

        System.out.println("I'm not rotating");

    }
}
