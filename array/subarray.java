package array;

public class subarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max_val=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                   sum+=nums[j];
                   max_val=Math.max(sum, max_val);
            }
        }
        System.out.println(max_val);
    }
}
