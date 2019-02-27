package com.stackroute.insurance;

public class ClaimManagerImpl  implements ClaimManager{

    private Claim claim;

    private InsuranceSurvayor insuranceSurvayor;

//    HealthInsuranceSurveyorImpl healthInsuranceSurveyorImpl;

    public ClaimManagerImpl(Claim claim,InsuranceSurvayor insuranceSurvayor) {
        this.insuranceSurvayor = insuranceSurvayor;
        this.claim = claim;

    }

    public boolean approve(Claim claim){
        System.out.println("approve");
        return insuranceSurvayor.validate(claim);

//        return true;
    }






}
