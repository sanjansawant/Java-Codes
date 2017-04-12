package com.Sanjan;

/**
 * Created by sanja on 1/6/2017.
 */
public class Desktop implements ITelephone {


    private String myNumber;
    private boolean isRinging;

    public Desktop(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("This phone does not have poweron button");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("now ringing "+myNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber.equalsIgnoreCase(this.myNumber)){
            isRinging=true;
            System.out.println("ring ring");
        }else{
            isRinging=false;
        }return isRinging;

    }

    @Override
    public boolean isRinging() {
        return  isRinging;
    }
}
