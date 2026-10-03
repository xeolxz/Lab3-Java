package Exo3;

public class Main {
    public static int[][] jagged_2d_arrays(){
        int[][] matrix=new int[5][];
        for(int i=0;i<matrix.length;i++){
            matrix[i]=new int[i+1];
            if(i<2){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=i+j+1;
                }
            }else{
                for(int j=0;j< matrix[i].length;j++){
                    matrix[i][j]=(i*(i+1)/2)+j+1;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        int[][] matrix=jagged_2d_arrays();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
