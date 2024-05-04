package array;

import java.util.Arrays;
import java.util.Scanner;

public class pratice {
   public static void main(String[] args) {
    int [] arr=new int[5];
    Scanner read = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        arr[i] =read.nextInt();
     }
    /*for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
     }
   //  for(int num:arr){
        System.out.println(num+" ");
     }
     */
     System.out.println(Arrays.toString(arr));

     read.close();
    }
    }

