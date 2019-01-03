package com.company;

import java.util.Random;

public class BigONotation {

    private  int[] arr;
    private  int arrSize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    public  BigONotation(int size){
        arrSize = size;
        arr = new int[size];
        fillRandomArray();
    }

    //O(1)
    public void addItemToArray(int newItem){
        arr[itemsInArray++] = newItem;
    }

    //O(N)
    public void linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexsWithValue = "";

        startTime = System.currentTimeMillis();

        for(int i = 0; i < arrSize; i++){
            if (arr[i] == value ){
                valueInArray = true;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(("Value found:" + valueInArray));
        long delta = endTime - startTime;
        System.out.println("Time="+ delta);
    }

    public void fillRandomArray(){
        Random rand = new Random();
        for (int i=0; i<arrSize; i++){
            arr[i] = rand.nextInt();
        }
    }

    public static void main(String[] args) {
	    BigONotation bigO_1000 = new BigONotation(1000);
        bigO_1000.linearSearchForValue(1);

        BigONotation bigO_10000 = new BigONotation(10000);
        bigO_10000.linearSearchForValue(1);

        BigONotation bigO_100000 = new BigONotation(100000);
        bigO_100000.linearSearchForValue(1);

        BigONotation bigO_1000000 = new BigONotation(1000000);
        bigO_1000000.linearSearchForValue(1);
    }
}
