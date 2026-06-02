import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] weight = new int[n];

    for(int i=0; i<n; i++){
      weight[i] = sc.nextInt();
    }

    Arrays.sort(weight);

    int low=0;
    int high=n-1;

    int maxSum = Integer.MIN_VALUE;
    while (low<high) {
      int sum = weight[low] + weight[high];
      if(sum > maxSum) maxSum = sum;
      low++;
      high--;
    }

    System.out.println(maxSum);
    sc.close();
  }
}
