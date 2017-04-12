package com.company;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

/**
 * Created by sanja on 4/5/2017.
 */
public class UtilitiesTest {
    private Utilities utils;

    @org.junit.Before
    public void setUp(){
        utils=new Utilities();

    }


     @org.junit.Test
    public void everyNthChar() throws Exception {
         char[] array1=utils.everyNthChar(new char[] {'h','e','l','l','o'},6);
         assertArrayEquals(new char[]{'h','e','l','l','o'},array1);

    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals("Wrong Implementation","ABCDEF",utils.removePairs("AABCDDEFF"));
        assertEquals("12345",utils.removePairs("1122334455"));
        assertNull("did not get null returned",utils.removePairs(null));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter() throws Exception {
        utils.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        assertEquals("abcdef",utils.nullIfOddLength("abcdef"));
        assertNull(utils.nullIfOddLength("abcde"));
    }

}