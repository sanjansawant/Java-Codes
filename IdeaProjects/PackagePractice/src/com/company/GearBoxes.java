package com.company;

/**
 * Created by sanja on 4/1/2017.
 */
public class GearBoxes extends GearBox {


    public GearBoxes(int gear, String number) {
        super(gear, number);

        GearBox.Gear some=new GearBox.Gear();
        some.changing();

    }
}
