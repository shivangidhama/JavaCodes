package introduction;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("It is even");
        }
        else{
            System.out.println("print it is odd");
        }  
        sc.close();
    }
    
}
