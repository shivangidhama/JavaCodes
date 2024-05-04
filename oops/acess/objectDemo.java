package oops.acess;


public class objectDemo {
int num;
float cgpa;
    @Override
    protected Object clone() throws CloneNotSupportedException {
      
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
       
        return this.num == ((objectDemo)obj).num;
    }

   

    @Override
    public int hashCode() {
       
        return super.hashCode();
    }

    @Override
    public String toString() {
        
        return super.toString();
    }   
    objectDemo(int num,float cgpa){
        this.num=num;
        this.cgpa=cgpa;
    } 

    public static void main(String[] args) {
    objectDemo obj1 = new objectDemo(34,8.44f);
    objectDemo obj2 = new objectDemo(34,8.44f);

    if(obj1.equals(obj2)){
    System.out.println("object are equal");
   }
    }
   
}
