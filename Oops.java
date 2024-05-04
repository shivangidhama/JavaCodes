class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructur called");//paramaterised constructur
    }
}

public class Oops {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Shivangi";
        s1.age=18;
        s1.printInfo();
    }
}
