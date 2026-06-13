import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        sc.close();

        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matix[row][col] == target) {
                System.out.println("Found");
                return;
            } else if (matix[row][col] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }

        System.out.println("Not Found");
        return;

        
    }
}