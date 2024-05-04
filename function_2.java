import java.util.Scanner;
public  class function_2 {
    public static void factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;}
        System.out.println(fact);
    }
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    factorial(n);
    sc.close();

}
}
