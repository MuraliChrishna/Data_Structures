package com.Krishna;

public class Main {

    public static void main(String[] args) {

        //declaration
        int[] arr;
        arr = new int[10];
        //or
        int[] arr1 = new int[10];

        //inserting values
        arr[0] = 10;
        arr[1] = 20;


        // iterate through an array

        for (int i =0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
            // will print all the values in the array
        }


        // multi dimensional array

        int arr2[][] ={{2,7,9}, {3,6,1}, {7,4,2}};

        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.println(arr2[i][j]);
            }
        }
    }
}
