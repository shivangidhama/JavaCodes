package array;
import java.util.Scanner;
public class array_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
int[] marks=new int[size];
System.out.println("enter elements in the array");
for(int i=0;i<size;i++){
    marks[i]=sc.nextInt();
}
for(int i=0;i<marks.length;i++){
    System.out.print(marks[i]+" ");
}
sc.close();
    }
    
}
