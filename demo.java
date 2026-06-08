import java.util.*;

public class demo {
    static ArrayList<String> ans = new ArrayList<>();
    static int n;

    static void dfs(int[][] a, int i, int j, String s) {
        if (i < 0 || j < 0 || i >= n || j >= n || a[i][j] != 1)
            return;

        if (i == n - 1 && j == n - 1) {
            ans.add(s);
            return;
        }

        a[i][j] = 0; // visited

        dfs(a, i + 1, j, s + "D");
        dfs(a, i, j - 1, s + "L");
        dfs(a, i, j + 1, s + "R");
        dfs(a, i - 1, j, s + "U");

        a[i][j] = 1; // backtrack
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        if (a[0][0] == 1)
            dfs(a, 0, 0, "");

        if (ans.isEmpty())
            System.out.println(-1);
        else
            for (String s : ans)
                System.out.println(s);
    }
}