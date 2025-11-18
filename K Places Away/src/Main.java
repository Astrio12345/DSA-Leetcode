import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter binary array elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        System.out.println("Result: " + kLengthApart(nums, k));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int lastOne = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (lastOne != -1 && i - lastOne - 1 < k) {
                    return false;
                }
                lastOne = i;
            }
        }
        return true;
    }
}
