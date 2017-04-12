package com.sanjan.algorithms;

import java.io.IOException;

/**
 * Created by sanja on 2/10/2017.
 */
public abstract class Client {

    /*
	 * This method performs the basic operation of reading the data from
	 * the given files.
	 */
    public abstract void read() throws IOException;

    /*
     * The record which are read are processed.
     * The data is processed and is stored in an arraylist.
     *
     */
    public abstract void process();

    /*
     * The processed data is then printed suing this method.
     * The records are stored in an array list, which are then mapped to respective fields.
     * These data is the printed on the console.
     */
    public abstract void print();
}
