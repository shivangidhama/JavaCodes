import java.util.*;
public class third {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("adult");}
            else{
                System.out.println("not adult");
            }
            sc.close();
        }
}
