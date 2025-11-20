import java.util.*;
public class Main {
    static List<List<String>> ans = new ArrayList<>();
    static char[][] board;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        solve(0);
        System.out.println("Total solutions: " + ans.size());
        System.out.println("Solutions:");
        for (List<String> sol : ans) {
            for (String row : sol) System.out.println(row);
            System.out.println();
        }
    }
    static void solve(int row) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            ans.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 'Q';
                solve(row + 1);
                board[row][col] = '.';
            }
        }
    }
    static boolean isSafe(int r, int c) {
        for (int i = 0; i < r; i++)
            if (board[i][c] == 'Q') return false;
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
}
