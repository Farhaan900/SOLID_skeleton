package com.stackroute.insurance;

public class Company implements  ClaimManager,HealthInsuranceSurvayor {

    Claim claim;

    public Company(Claim claim) {
        this.claim = claim;
    }

    public boolean claimed(){
        if( this.validate(claim)){
            if(this.approve(claim)) {
                return true;
            }
        }

        return false;

    }

    @Override
    public boolean approve(Claim claim) {
        System.out.println("approved");
        return true;
    }

    @Override
    public boolean validate(Claim claim) {
        System.out.println("validated");
        return true;
    }
}
