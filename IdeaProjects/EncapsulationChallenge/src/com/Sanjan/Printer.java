package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Printer {

    private boolean isDuplex;
    private int pagesPrinted;
    private int tonerLevel = 100;


    public Printer(boolean isDuplex, int pagesPrinted, int tonerLevel) {
        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;

        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel -= tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
    }

    public int getPagesPrinted(int pages) {

        if (isDuplex) {
            this.pagesPrinted += (int) (pages / 2);

            return this.pagesPrinted;

        } else {
            this.pagesPrinted+=pages;
            return (this.pagesPrinted);
        }

    }

    public boolean isDuplex() {
        return isDuplex;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int fillToner(int toner) {
        if (toner >= 0 && toner <= 100) {
            if ((this.tonerLevel + toner) > 100) {
                System.out.println("toner level cannot be greater than 100");
                return this.tonerLevel;
            } else {

                return this.tonerLevel += toner;
            }
        } else {
            return -1;
        }

    }
}
