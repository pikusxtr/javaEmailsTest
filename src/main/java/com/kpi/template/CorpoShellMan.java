package com.kpi.template;

/**
 * Created by SG0213064 on 3/4/2015.
 */
public class CorpoShellMan extends CorpoMan {
    int fuelAmount;
    public CorpoShellMan(){
        //super();
        fuelAmount = 555; //base amount when worker created

    }



    public int getFuelAmount(){
        return fuelAmount;
    }

    public void increaseFuelAmount(int increaseFor){
        this.fuelAmount = this.fuelAmount + increaseFor;
    }


}
