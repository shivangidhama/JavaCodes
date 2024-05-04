package array;

import java.util.Scanner;

public class tset3 {
    public static int countWays(int[] nums, int target) {
        return dfs(nums, 0, 0, target);
    }
    
    public static int dfs(int[] nums, int index, int curSum, int target) {
        if (index == nums.length) {
            if (curSum == target) {
                return 1;
            }
            return 0;
        }
        
        int addWays = dfs(nums, index + 1, curSum + nums[index], target);
        int subtractWays = dfs(nums, index + 1, curSum - nums[index], target);
        
        return addWays + subtractWays;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        scanner.nextLine(); 
        for (int t = 0; t < numTests; t++) {
            String[] line = scanner.nextLine().trim().split("\\s+");
            int n = Integer.parseInt(line[0]);
            int target = Integer.parseInt(line[1]);
            int[] nums = new int[n];
            String[] numStrings = scanner.nextLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(numStrings[i]);
            }
            int ways = countWays(nums, target);
            System.out.println(ways);
        }
        scanner.close();
    }
}
