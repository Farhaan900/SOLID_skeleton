package com.stackroute.toy;

import java.math.BigDecimal;

public class Plane implements Move,Fly,Toy {

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getColor() {
        return color;
    }

    private BigDecimal price;
    private String color;

    public static void main(String[] args){
        Plane plane = new Plane();

        plane.move();

        plane.fly();

    }

    public void move(){
        System.out.println("This is the move function for a plane");
    }

    public void fly(){
        System.out.println("This is the fly function for a plane");
    }

}
