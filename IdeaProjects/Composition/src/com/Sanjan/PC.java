package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class PC {

    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor, MotherBoard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        //fancy Graphics;
        theMonitor.drawPixelAt(1500,1200,"yellow");
    }


    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }
}
