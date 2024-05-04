import java.util.Scanner;
public class four {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a =sc.nextInt();
        System.out.println("enter b");
        int b =sc.nextInt();
        int n=1;
        switch(n){
            case 1:
            System.out.println(a+b);
            case 2:
            System.out.println(a-b);
            case 3:
            System.out.println(a*b);
            case 4:
            System.out.println(a/b);
            case 5:
            System.out.println(a%b);
        }
sc.close();
    }
}
