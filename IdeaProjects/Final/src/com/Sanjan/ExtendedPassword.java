package com.Sanjan;

/**
 * Created by sanja on 1/9/2017.
 */
public class ExtendedPassword extends Password {

    private int decryptPassword;

    public ExtendedPassword(int encrypt) {
        super(encrypt);
        this.decryptPassword=encrypt;
    }


}
