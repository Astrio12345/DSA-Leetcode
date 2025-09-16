import java.util.*;
public class Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the money in each house:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = rob(nums, 0);
        System.out.println("Maximum money that can be robbed = " + result);
    }
    public static int rob(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        int skip = rob(nums, i + 1);
        int take = nums[i] + rob(nums, i + 2);
        return Math.max(skip, take);
    }
}