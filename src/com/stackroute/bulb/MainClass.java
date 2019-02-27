package com.stackroute.bulb;

public class MainClass {

    public static void main(String[] args){

        CflBulb cflBulb = new CflBulb();
        Fan fan = new Fan();
        WallSwitch wallSwitch = new WallSwitch(cflBulb);

        WallSwitch fanSwitch = new WallSwitch(fan);

        wallSwitch.press();
        wallSwitch.press();
        wallSwitch.press();
        wallSwitch.press();
        wallSwitch.press();
        
        fanSwitch.press();
        fanSwitch.press();
        fanSwitch.press();
        fanSwitch.press();
        fanSwitch.press();




    }

}
