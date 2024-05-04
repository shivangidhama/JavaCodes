import java.util.Scanner;
public class function_4 {
    public static void prime(int n){
        int flag=0,m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("not prime");
                flag=1;
            break;
        }
        } 
    if(flag==0)
System.out.println("n is prime");}
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            prime(n);
            sc.close();
        }
    
}
