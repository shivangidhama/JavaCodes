package array;

import java.util.Arrays;

public class array_5 {
    public static void main(String[] args) {
        int[] arr={1,3,39,18};
        System.out.println(Arrays.toString(arr));
        System.out.println("After reversing");
        int start=0;
        int end =arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    static void reverse(int a[]){


    }
}
