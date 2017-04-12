package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        int count=0;

        for (int i = 0; i <= 100; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                count++;

                if (count==10){
                    break;
                }
            }

        }

        System.out.println("total primes is "+count);



        int count1=6;
        while(true){

            if(count1!=6){
                break;
            }
            System.out.println(count1);
            count1++;


        }

        int count2=5;

        do{
            System.out.println("==> "+count2);
            count2++;
            if(count2==100){
                break;
            }
        }while(count2<1000);


        int number=5;
        int count3=0;
        while (number<=20){
            if(!(isEven(number))){
                number++;
                continue;
            }

            System.out.println("** " + number);
            count3++;

            if(count3<5){
            number++;
            }else{
                break;
            }


        }
        System.out.println(count3);

        if(true)

            System.out.print("1");

        else

            System.out.print("3");

        System.out.print("2");



    }


    public static boolean isEven(int number){

        if(number %2 ==0){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isPrime(int number) {

        if(number==1 || number==0 ){
            return false;
        }else {

            for (int i = 2; i <= (number/2); i++) {


                if (number % i == 0) {
                    return false;
                }

            }
            return true;

        }
    }
}
