import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] query = new int[2];
            query[0] = sc.nextInt();
            query[1] = sc.nextInt();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = query[0]; i <= query[1]; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            }

            System.out.println(max - min);
        }
    }
}