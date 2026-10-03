package Exo7;

public class Main {
    public static double avg(int[] a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
    public static double stdev(int[] a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=(a[i]-avg(a))*(a[i]-avg(a));
        }
        return Math.sqrt(sum/(a.length-1));
    }
    public static void main(String[] args){
        int[] arr={1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.println(stdev(arr));
    }
}
