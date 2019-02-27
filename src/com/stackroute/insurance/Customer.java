package com.stackroute.insurance;

public class Customer {
    String name;
    int age;

    public static void main(String[] args){

        Claim claim = new Claim(1234);
        HealthInsuranceSurveyorImpl healthInsuranceSurveyor = new HealthInsuranceSurveyorImpl();
        AccidentalInsuranceSurveyorImpl accidentalInsuranceSurveyor = new AccidentalInsuranceSurveyorImpl();



        ClaimManagerImpl comp = new ClaimManagerImpl(claim,accidentalInsuranceSurveyor);

        System.out.println(comp.approve(claim));





//        if(comp.claimed()){
//            System.out.println("Insurance is claimed");
//        }

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
