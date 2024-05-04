package array.searching;

import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        String name ="Shivangi";
        char target = 'i';
        
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        }



         static int Linear(int arr[],int key){
            if(arr.length==0){
                return -1;
            }
            for(int i=0;i<arr.length;i++){
                int element = arr[i];
                if(element == key){
                    return i;    
                }
            }
        return -1;
            }
        static boolean search(String str,char target){
            if(str.length()==0){
                return false;
            }
            for(int i=0;i<str.length();i++){
                if(target == str.charAt(i)){
                    return true;
                }
            }
        return false;
        }
    }

