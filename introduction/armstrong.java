package introduction;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        double r;
        double sum=0;
        double count=0;
        int num=n;
        int temp=n;
        while(temp>0){
temp=temp/10;
count++;
        }
        while(n>0){
         r=n%10;
         sum=sum +(Math.pow(r,count));
         n=n/10;
        }
        if(num==sum){
            System.out.println("it is arm strong");
        }
        else{
            System.out.println("It is not armstrong");
        }
        sc.close();
    }
}
