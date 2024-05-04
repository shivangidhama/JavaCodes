package array;
import java.util.Scanner;
public class array_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
            System.out.println("element"+num+" found at location "+(i+1));
            break;}
            else
            System.out.println("element not found");
        }

sc.close();
    }
    
}
