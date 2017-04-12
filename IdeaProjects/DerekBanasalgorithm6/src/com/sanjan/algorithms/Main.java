package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {
	    int[] array={13,12,14,15,11,16,17,12,15,10};
        mergeSort(array,0,array.length-1);
        display(array);

    }


    public static void mergeSort(int[] array,int lo,int hi){

        int low=lo;
        int high=hi;
        if(low>=high){

            return;
        }
        int middle=(low+high)/2;
        mergeSort(array,low,middle);
        mergeSort(array,middle+1,high);
        int end_low=middle;
        int start_high=middle+1;

        while((low<=end_low)&&(start_high<=high)){

            if(array[low]<array[start_high]){
                low++;
            }else{


                int Temp = array[start_high];



                //System.out.println("Temp: " + Temp);



                // Decrement backwards through the first array starting

                // at the last index in the first array

                for (int k = start_high - 1; k >= low; k--) {

              /*      System.out.println("array[" + k + "] = " + array[k]

                                    + " Stored in array index " + (k + 1));*/

                    array[k + 1] = array[k];

                }

                /*System.out.println(Temp + " is stored in index " + low);*/


                array[low] = Temp;

                low++;

                end_low++;

                start_high++;

            }


        }

    }


    public static void display(int[] array){
        System.out.println("===========");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
