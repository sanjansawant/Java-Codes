package com.Sanjan;

/**
 * Created by sanja on 1/6/2017.
 */
public interface ITelephone {

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
