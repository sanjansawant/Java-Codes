package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        Case theCase=new Case("220B","Dell","240",new Dimensions(20,20,5));
        Resolution nativeResolution=new Resolution(2540,1440);
        Monitor theMonitor=new Monitor("27inch Beast","Acer",27,nativeResolution);
        MotherBoard theMotherBoard=new MotherBoard("BJ-220","ASUS",4,6,"v2.44");
        PC thePC=new PC(theCase,theMonitor,theMotherBoard);
//        thePC.getTheMonitor().drawPixelAt(1500,1200,"yellow");
//        thePC.getTheMotherBoard().loadProgram("windows 1.1");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

    }
}
