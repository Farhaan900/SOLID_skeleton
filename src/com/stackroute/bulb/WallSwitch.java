package com.stackroute.bulb;

public class WallSwitch implements Switchable {

    ElectricAppliance electricAppliance;
    private boolean state;
    WallSwitch (ElectricAppliance electricAppliance){
        this.electricAppliance = electricAppliance;
    }

    @Override
    public void press() {

        if (state)
        {
            electricAppliance.on();

            this.state = false;

    }
        else {

            electricAppliance.off();

            this.state = true;

        }
    }
}
