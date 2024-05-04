import java.util.ArrayList;
import java.util.Collections;
public class array_list {

    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);
        int a=list.get(1);
        System.out.println(a);

        list.add(1,1);

        list.set(0, 5);
        System.out.println(list);

        list.remove(3);

        int x= list.size();
        System.out.println("length of the list is"+x);

        Collections.sort(list);
        System.out.println(list);
    }
}
