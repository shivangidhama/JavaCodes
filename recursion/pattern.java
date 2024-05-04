package recursion;

public class pattern {
    public static void main(String[] args) {
        uprighttriangle(4, 0);
        lowrighttriangle(4, 0);
    }
    static void uprighttriangle(int r,int c){
        if(r==0)
        return ;
        if(c<r){
            uprighttriangle(r, c+1);
            System.out.print("*");
        }
        else{
            uprighttriangle(r-1, 0);
            System.out.println();
        }
    }
    static void lowrighttriangle(int r,int c){
        if(r==0)
        return ;
        if(c<r){
            System.out.print("*");
            lowrighttriangle(r, c+1);
        }
        else{
            System.out.println();
            lowrighttriangle(r-1, 0);
            
        }
    }

    
}
