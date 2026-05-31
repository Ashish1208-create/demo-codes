import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int swap = 0;

    for (int i = 0; i < n - 1; i++) {
      int miniIndex = i;

      for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[miniIndex])
          miniIndex = j;
      }

      if (miniIndex != i) {
        int temp = nums[i];
        nums[i] = nums[miniIndex];
        nums[miniIndex] = temp;
        swap++;
      }
    }

    for (int x : nums) {
      System.out.print(x + " ");
    }
    System.out.println();
    System.out.println(swap);
    sc.close();
  }
}
