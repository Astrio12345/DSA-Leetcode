import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] bits = new int[n];
        System.out.println("Enter elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            bits[i] = sc.nextInt();
        }
        System.out.println("Result: " + isOneBitCharacter(bits));
    }
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == bits.length - 1;
    }
}
