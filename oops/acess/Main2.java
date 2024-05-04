package oops.acess;

public class Main2 {
    public static void main(String[] args) {
        A obj = new A(4, "shiv");//num is private sonwe can not directly asses it

        System.out.println(obj.getNum());
    }
}
