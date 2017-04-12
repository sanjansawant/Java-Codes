package com.Sanjan;

/**
 * Created by sanja on 1/9/2017.
 */
public class Password {
    private static final int password=123456789;
    private final int encrypt;

    public Password(int encrypt) {
        this.encrypt = encryptdecrypt(encrypt);
    }

    public int encryptdecrypt(int encrypt){
        System.out.println(password^encrypt);
        return (password^encrypt);
    }

    public final void saving(){
        System.out.println("saving "+this.encrypt);
    }

    public boolean letMeIn(int password) {

        if(encryptdecrypt(password)==encrypt){
            System.out.println("welcome in");
            return true;
        }else{
            return false;
        }

    }

}
