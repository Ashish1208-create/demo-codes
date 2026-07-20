import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int m = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int high = maxNum(nums);
        int low = minNum(nums);

        while (low<high) {
            int mid = (low+high)/2;

            if(nums[mid] == )
            
        }
        // System.out.println(maxNum(nums));
        // System.out.println(minNum(nums));
    }

    public static int maxNum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int minNum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
