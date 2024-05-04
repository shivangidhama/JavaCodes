package oops;
class student{
    int roll;
    String name;
    float marks;
student(){
    this.name="Shivangi";
    this.roll=32;
    this.marks=89;

}
student(int roll,String name,float marks){
    this.roll=roll;
    this.name=name;
    this.marks=marks;
}
}
public class oop1 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(2,"shiv",81);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
