package Exo1;


public class Main{
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] sortedArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sortedArr[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int max_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(sortedArr[max_idx]<sortedArr[j]){
                    max_idx=j;
                }
            }
            int tmp=sortedArr[max_idx];
            sortedArr[max_idx]=sortedArr[i];
            sortedArr[i]=tmp;
        }
        return sortedArr;
    }
    public static void main(String[] args){
        int[] arr={106,26,81,5,15};
        System.out.println("Unsorted array : ");
        printArray(arr);
        System.out.println("Sorted array : ");
        printArray(sortIntegers(arr));
    }
}