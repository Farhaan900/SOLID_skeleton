package com.stackroute.toy;

import java.math.BigDecimal;

public class Car implements Move,Toy {

    private BigDecimal price;
    private String color;


    public BigDecimal getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args){

        Car car = new Car();

        car.move();


    }

    public void move(){
        System.out.println("This is the move function for a car");
    }


}
