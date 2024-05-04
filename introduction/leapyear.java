package introduction;
import java.util.Scanner;

public class leapyear {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int year=read.nextInt();
        if(year%4==0 && year%100!=0||year%400==0){
            System.out.println("Year is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        read.close();
}
}
