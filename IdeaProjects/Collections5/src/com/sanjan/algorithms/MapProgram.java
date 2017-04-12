package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 1/18/2017.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> dictionaries=new HashMap<>();
        if(dictionaries.containsKey("JAVA")){
            System.out.println("language is already there");
        }else {
            dictionaries.put("JAVA", "a compiled high level, object oriented, platform independent language");
            System.out.println("JAVA added successfully");
        }
        dictionaries.put("Python","an interpreted, object-oriented, high level programming language with dynamic semantics");
        dictionaries.put("Algol","an algorithmic language");
        dictionaries.put("Basic","Beginers all purpose symbolic instruction code");
        dictionaries.put("Lisp","therein lies madness");
        System.out.println(dictionaries.get("JAVA"));
        if(dictionaries.containsKey("JAVA")){
            System.out.println("language is already there");
        }else{
        dictionaries.put("JAVA","This is course is about java");
        System.out.println(dictionaries.get("JAVA"));
    }

        System.out.println("==================================================");

        for(String key:dictionaries.keySet()){

            System.out.println(key+" : "+dictionaries.get(key));
        }
        System.out.println("==================================================");

        //dictionaries.remove("Lisp");
        if(dictionaries.remove("Algol","an algorithmic language")){
            System.out.println("ALGOL removed");
        }else{
            System.out.println("key value pair not matched");
        }

        System.out.println(dictionaries.replace("Lisp","somthing"));
        //System.out.println("==> "+dictionaries.remove("JAVA"));
        System.out.println("==> "+dictionaries.replace("Scala","something"));
        for(String key:dictionaries.keySet()){

            System.out.println(key+" : "+dictionaries.get(key));
        }
    }
}
