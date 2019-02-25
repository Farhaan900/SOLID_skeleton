package com.stackroute.bulb;

public class Omega implements Bulb,Switch {

    public boolean state;

    public static void main(String[] args){

        Omega omega = new Omega();

        omega.setState(true);

        omega.isState();

    }

    public void setState(boolean state){
        this.state = state;
    }

    public boolean isState(){
        System.out.println("Bulb state : "+state);
        return this.state;
    }

}
