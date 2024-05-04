package recursion;

import java.util.ArrayList;

public class search {
    public static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
          return mid;

        if(target<arr[mid])
        return binarysearch(arr, target,start, mid-1);

        return binarysearch(arr, target, mid+1,end);
    }
    public static boolean linearsearch(int[] arr,int target,int index){
        if(index == arr.length)
        return false;

        return arr[index]==target || linearsearch(arr, target, index+1);
    }
    public static int findindex(int[] arr,int target,int index){
        if(index==-1)
        return -1;
        if(arr[index]==target)
        return index;
        else{
            return findindex(arr,target,index+1);
        }
    }
  static  ArrayList <Integer>list= new ArrayList<>();
        public static void findallindex(int[] arr,int target,int index){
            if(index==arr.length)
            return ;
            if(arr[index]==target)
            list.add(index);
            
            findallindex(arr,target,index+1);
            
        }
     static ArrayList<Integer> findallindex(int[] a,int key,int i,ArrayList<Integer>list){

    if(i==a.length)
    return list;
    if(a[i]==key) 
    list.add(i) ;
    
    return findallindex(a, key, i+1, list);
    }
    
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 4, 4, 5};
        ArrayList <Integer>ans= findallindex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }
}

