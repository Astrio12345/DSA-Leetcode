import java.util.*;
public class Main {
    public static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        int winner = josephus(n, k) + 1;
        System.out.println(winner);
    }
}
