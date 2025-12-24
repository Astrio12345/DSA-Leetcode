class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i=n-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}