package com.company;

/**
 * Created by sanja on 3/26/2017.
 */
public class Printer {

    private int tonerLevel=100;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {

        if(tonerLevel>=0 &&tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplex = duplex;
    }

    public void addTonerLevl(int level){

        if(this.tonerLevel+level<=100){
            this.tonerLevel+=level;
        }
    }

    public int numberOfPagesPrinted(){
        if(this.duplex) {
            System.out.println("Printing in duplex mode");
            return (this.numberOfPagesPrinted/2);
        }else{
            return this.numberOfPagesPrinted;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
