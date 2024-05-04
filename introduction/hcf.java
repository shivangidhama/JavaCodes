package introduction;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int hcf=0;
        for(int i=1;i<x||i<y;i++){
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }
        System.out.println("Hcf if"+hcf);
        System.out.println("LCM"+(x*y)/hcf);
        
        
        sc.close();

    }
}
