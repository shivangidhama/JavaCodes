package array;
import java.util.Scanner;
public class array_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int row=sc.nextInt();
        int cols=sc.nextInt();
int[][] matrix=new int[row][cols];
System.out.println("enter elements in the matrix");
for(int i=0;i<row;i++){
    for(int j=0;j<cols;j++){
        matrix[i][j]=sc.nextInt();
    }
}for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" ");
    }System.out.println();
    sc.close();
}}}
