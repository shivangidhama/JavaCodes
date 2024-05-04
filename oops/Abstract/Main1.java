package oops.Abstract;

public class Main1 {
    public static void main(String[] args){
        child son =new child(30);
       son.career();
       Parent daughter = new child(28);
       daughter.career();

        Parent.hello();
    }
}
