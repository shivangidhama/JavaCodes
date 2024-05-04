import java.util.Scanner;
public class functio_3 {
    public static void fibbonaci(int n){
        int a=-1,b=1,sum=0;
        for(int i=1;i<=n;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            fibbonaci(n);
            sc.close();}
    }
    

