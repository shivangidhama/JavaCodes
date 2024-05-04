package array.searching;

public class binarysearch {
    public static void main(String[] args) {
    int []a={1,2,3,4,5,6};
    int start=0;
    int end=a.length-1;
    int num =2;
    while(start<=end){
        int mid = (start+(end-start)/2);
        if(a[mid]==num){
            System.out.println(mid);
            break;
        }
        else if(num<a[mid]){
            end=mid-1;
        }
        else{
           start=mid+1;
        }

    }
}

 }

