package Exo2;

public class Main {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static void reverse(int[] arr){
        System.out.println("Original array:");
        printArray(arr);
        for(int i=0;i< arr.length/2;i++){
            int tmp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=tmp;
        }
        System.out.println("Reversed array:");
        printArray(arr);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
