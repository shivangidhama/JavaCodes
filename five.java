import java.util.Scanner;
public class five {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter week number");
int n=sc.nextInt();
switch(n){
    case 1:
    System.out.println("Monday");
    break;
    case 2:
    System.out.println("Tuesday");
    break;
    case 3:
    System.out.println("Wednesday");
    break;
    case 4:
    System.out.println("Thrusday");
    break;
    case 5:
    System.out.println("friday");
    break;
    case 6:
    System.out.println("Saturday");
    break;
    case 7:
    System.out.println("Sunday");
    break;
    default:
    System.out.println("Invalid input");
}
sc.close();
    }
}
