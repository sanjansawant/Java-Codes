package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = ((int) (Math.random() * 100) + 1);
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }


        //shellSort(array);

        mergeSort(array, 0, array.length - 1);


    }


    public static int[] shellSort(int[] array) {

        int outer, temp, inner;

        int interval = 1;

        while (interval <= (array.length / 3)) {

            interval = (interval * 3) + 1;
        }

        while (interval > 0) {

            for (outer = interval; outer <= array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (array[inner - interval] > temp && (inner > interval - 1)) {

                    array[inner] = array[inner - interval];
                    inner -= interval;
                }
                array[inner] = temp;
            }

            interval = (interval - 1) + 3;

        }
        return array;
    }


    public static void mergeSort(int[] array, int lo, int n) {

        int low=lo;
        int high=n;
        if(low>=high){
            return;
        }
        int middle=(low+high)/2;

        mergeSort(array,low,middle);
        mergeSort(array,middle+1,high);

        int end_low=middle;
        int start_high=middle+1;
        while(low<=end_low&&start_high<=high){

            if(array[low]<array[start_high]){
                low++;
            }else{

                int temp=array[start_high];

                for(int k=start_high-1;k>=low;k--){

                    array[k+1]=array[k];
                }

                array[low]=temp;
                low++;
                end_low++;
                start_high++;
            }




        }

        System.out.println("============");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }


}





