package Exo6;

import Exo1.*;
public class Main {
    public static int median(int[] arr){
        int[] sortedArr= Exo1.Main.sortIntegers(arr);
        return sortedArr[sortedArr.length / 2];
    }
    public static void main(String[] args){
        int[] arr1={5,2,4,17,55,4,3,26,18,2,17};
        int[] arr2={42,37,1,97,1,2,7,42,3,25,89,15,10,29,27};
        System.out.println(median(arr1));
        System.out.println(median(arr2));
    }
}
