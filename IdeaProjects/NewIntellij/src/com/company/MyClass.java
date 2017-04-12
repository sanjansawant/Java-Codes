package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
class MyClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        Class c=myClass.getClass();
        try{
            System.out.println(c.getMethod("getNumber",null).toString());
            System.out.println("here");
            System.out.println(c.getDeclaredMethod("setNumber",null).toString());
            System.out.println("here1");

        }catch(NoSuchMethodException | SecurityException s){
            System.out.println("called");
        }
    }

    public Integer getNumber(){
        return 2;
    }
    public void setNumber(Integer n){

    }
}
