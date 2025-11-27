import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits: ");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.print("Output: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
