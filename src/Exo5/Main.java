package Exo5;

public class Main {
    public static int[][] matrixAdd(int[][] A,int[][] B){
        int[][] C=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args){
        int[][] A={
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int[][] B={
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int[][] C=matrixAdd(A,B);
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
