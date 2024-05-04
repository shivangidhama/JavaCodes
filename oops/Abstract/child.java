package oops.Abstract;

public class child extends Parent {
    public child(int age){
        super(age);
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love myself");
}
}