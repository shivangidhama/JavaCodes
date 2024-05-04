package recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
       System.out.println(subsetret(" ","abc"));
    }
    public static void subset(String p,String up){
       if(up.isEmpty()){
       System.out.println(p);
       return;
       }
       char ch= up.charAt(0);
       subset(p+ch, up.substring(1));
       subset(p, up.substring(1));
    }
    public static ArrayList<String> subsetret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
    char ch=up.charAt(0);
    ArrayList<String> left=subsetret(p+ch, up.substring(1));
    ArrayList<String> right=subsetret(p, up.substring(1));
    left.addAll(right);  
    
    return left;
    }
}
