package recursion;

public class number {

    public static void num(int n){
       if(n==0)
       return ;
       System.out.println(n);
       num(n-1);
    }
    public static int sumofdigit(int n){
        if(n%10==n)
        return n;

    return (n%10)+sumofdigit(n/10);
    }
    public static void main(String[] args) {
        int n=532;
        System.out.println(sumofdigit(n));
    }
    
}
