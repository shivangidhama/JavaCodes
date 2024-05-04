package array;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        output(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        } 
sc.close();
    }
public static void output(int [][] mat){
    int n=mat.length;
    int m=mat[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){
                for(int k=0;k<m;k++){
                    mat[i][k]=0;
                }
                for(int k=0;k<n;k++){
                    mat[k][j]=0;
                }
            }
        }
    }
}
}
