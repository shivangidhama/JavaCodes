package array;
import java.util.Scanner;
public class array_4 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int []a= new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<a.length;i++){
    if(a[i]>max)
    max=a[i];
    if(a[i]<min)
    min=a[i];
}
System.out.println("largest number is "+max);
System.out.println("smallest number is"+min);
sc.close();

    }
}
