package oops;

public class Animal{
    
        String name;
        int age;
    
        Animal(String name,int age){
            this.name=name;
            this.age=age;
        }
    
        void eat(){
            System.out.println("Animal eats");
        }
        void sleep(){
            System.out.println("Animal sleeps");
        }
    }
    class Mammal extends Animal{
       Mammal(String name,int age){
        super(name, age);
       }
        

        void makeSound(){
            System.out.println("Mammal makes weird sounds");
        }
    }
    class Bird extends Animal{
        Bird(String name, int age) {
            super(name, age);
            //TODO Auto-generated constructor stub
        }

        void fly(){
            System.out.println("Birds can fly");
        }
    }
    
    

