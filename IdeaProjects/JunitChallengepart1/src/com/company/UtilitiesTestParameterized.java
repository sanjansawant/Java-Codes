package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sanja on 4/5/2017.
 */
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities utils;
    private String expected;
    private String actual;

    public UtilitiesTestParameterized(String expected, String actual) {

        this.expected = expected;
        this.actual = actual;
    }

    @org.junit.Before
    public void setUp(){
        utils=new Utilities();

    }

    @Parameterized.Parameters
    public static Collection<Object> returning(){

        return Arrays.asList(new Object[][]{
                {"ABCDEFF","ABCDEF"},{"AB88EFFG","AB8EFG"},{"112233445566","123456"},{"ZYZQQB","ZYZQB"},{"A","A"}
        });

    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(actual,utils.removePairs(expected));

    }


}
