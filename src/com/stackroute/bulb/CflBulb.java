package com.stackroute.bulb;

public class CflBulb implements ElectricAppliance {

    @Override
    public void on() {

        System.out.println("I'm on");

    }

    @Override
    public void off() {

        System.out.println("I'm off");

    }
}
