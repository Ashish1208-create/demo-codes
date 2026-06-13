import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // int maxi = Arrays.stream(nums).max().getAsInt();
        // int left = 0;
        int right = n - 1;
        int maxArea = 0;
        int left = 0;

        while (left < right) {
            int min = Math.min(nums[left], nums[right]);
            int currArea = min * (right - left);
            maxArea = Math.max(maxArea, currArea);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }

        }

        System.out.println(maxArea);
    }
}