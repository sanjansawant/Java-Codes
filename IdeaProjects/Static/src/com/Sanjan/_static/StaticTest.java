package com.Sanjan._static;

/**
 * Created by sanja on 1/9/2017.
 */
public class StaticTest {

    private String anme;
    private static int numInstances=0;

    public StaticTest(String anme) {
        this.anme = anme;
        numInstances++;
        getNumInstances();
    }

    public String getAnme() {
        return anme;
    }

    public static int getNumInstances() {
        return numInstances;
    }
}
