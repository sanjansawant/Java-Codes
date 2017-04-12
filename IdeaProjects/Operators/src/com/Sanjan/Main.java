package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("something illogical");
        }


        System.out.println((5 > 2) ? 5 : 2);

        double test1 = 20;
        double test2 = 80;
        double test3 = ((test1 + test2) * 25d);
        double test4 = test3 % 40d;
        System.out.println(test4);
        if (test4 <= 20) {
            System.out.println("<=20");
        } else {
            System.out.println("greater than 20");
        }

        int i = 5;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);

        int distance=4750;
        int km=distance/1000;
        int metres=distance%1000;
        System.out.println(km+" "+metres);

        long time=4_000_000_000L;
        int second=(int)(time/(Math.pow(10,9)));
        System.out.println(Math.pow(10,9));
        System.out.println(second);

        int radius=85;
        int piint=(int)((22.0/7.0)*2*radius);
        float pifloat=((22.0f/7.0f)*2*radius);
        double pidouble=((22.0d/7.0d)*2*radius);

        System.out.println(piint+" "+pifloat+" "+pidouble);


        System.out.println(( 3 * 5 ) % 7 +" 1");
        System.out.println(3 * 5 % 7 +" 1");
        System.out.println(3 + 5 % 7+" 8");
        System.out.println(( 3 + 5 ) % 7+" 1");
        System.out.println(6 * 5 + 11 % 20+" 41");
        System.out.println(( 6 * ( 5 + 11 ) ) % 20+" 16");

        boolean isFemale=false;
        boolean isBlond=false;
        boolean isGraduated=false;

        boolean result=(isFemale && !isBlond && isGraduated) || (!isFemale &&isBlond && isGraduated);
        System.out.println(result);



        char a=66;
        char b=(char)(a+'a'-'A');
        System.out.println(b);
        System.out.println('a'-'A');

        double d1 = 11.5d;

        float f1 = 11.5f;
        double q1 =(((d1+1.5d)*1.0)-1.5d);

        System.out.println("==>"+(q1 == f1));


        double d = 100.1;

        float f = 0.1f;

        System.out.println(d -f == 100);


    }
}
