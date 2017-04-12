package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sanja on 4/7/2017.
 */
public class Generics {

    public static void main(String[] args) {
        String email="sanjan.sawant25@gmail.com";
        Pattern pattern= Pattern.compile("(?i)[a-z]{1,45}[\\.]?(?i)[a-z0-9]{1,45}[\\@]{1}[a-z]{1,45}[\\.]?(?i)[a-z]{1,45}");
        Matcher matcher= pattern.matcher(email);
        System.out.println(matcher.matches());
    }

}
