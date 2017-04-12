package com.Sanjan;

/**
 * Created by sanja on 1/6/2017.
 */
public class MobilePhone  implements ITelephone {


    private String myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("mobile phone poweron button");
    }

    @Override
    public void dial(String phoneNumber) {
        if(isOn){

        System.out.println("now ringing "+phoneNumber);
        }else{
            System.out.println("mobile phone is not on");
        }


    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the mobilephone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber.equalsIgnoreCase(this.myNumber) && isOn){
            isRinging=true;
            System.out.println("Melody ring");
        }else{
            isRinging=false;
            System.out.println("mobile not on or number different");
        }return isRinging;

    }

    @Override
    public boolean isRinging() {
        return  isRinging;
    }
}

