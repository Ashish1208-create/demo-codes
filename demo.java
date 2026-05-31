import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int high = n - 1;
    int low = 0;
    int maxVisi = Integer.MIN_VALUE;

    while (low< high) {
      int visi = Math.min(nums[high], nums[low])* (high - low);
      maxVisi = Math.max(maxVisi, visi);
      if (nums[low] < nums[high]) {
        low++;
      }else high--;
    }

    System.out.println(maxVisi);
    sc.close();
  }
}
