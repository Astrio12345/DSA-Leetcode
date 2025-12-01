class Solution {
    public String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 2025;
        String romanNumeral = solution.intToRoman(number);
        System.out.println("The Roman numeral for " + number + " is: " + romanNumeral);
    }
}