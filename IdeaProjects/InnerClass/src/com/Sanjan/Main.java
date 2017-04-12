package com.Sanjan;
import java.util.*;




public class Main {
    private static Scanner input=new Scanner(System.in);
    private static Button button=new Button("print");
    public static void main(String[] args) {

        /*GearBox mclaren=new GearBox(6);
//        GearBox.Gear first=mclaren.new Gear(1,12.3);
//        //GearBox.Gear second=new GearBox.Gear(7,12.3);
//        System.out.println(first.driveSpeed(1000));

        *//*mclaren.addGears(1,5.3);
        mclaren.addGears(2,10.6);
        mclaren.addGears(3,15.9);
        mclaren.addGears(4,20.12);
*//*
        mclaren.changeGear(2);
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        System.out.println(mclaren.getMaxGears());*/
        class clickListener implements Button.OnClickListener{

            public clickListener(){
                System.out.println("I've been attached");
            }


            @Override
            public void onClick(String name) {
                System.out.println(name+" was clicked");
            }
        }
        System.out.println("===== ");
        //created local class and have that implements onclicklistener interface
        //assign instance of it to our button
        //button.setOnClickListener(new clickListener());
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String name) {
                System.out.println(name+" was clicked");
            }
        });
        listen();
    }


    public static void listen(){

        System.out.println("***");
        boolean flag=true;

        while(true){

            System.out.println("Enter the action");
            int action=input.nextInt();
            switch(action){

                case 0: flag=false;
                        break;
                case 1:
                    button.onClick();


            }
        }
    }
}
