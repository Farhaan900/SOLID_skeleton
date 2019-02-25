package com.stackroute.insurance;

public class Customer {
    String name;
    int age;

    public static void main(String[] args){

        Claim claim = new Claim(1234);

        Company comp = new Company(claim);

        if(comp.claimed()){
            System.out.println("Insurance is claimed");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
