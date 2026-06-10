import java.util.*;

public class demo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int w = sc.nextInt();

    int[] weight = new int[n];

    for(int i=0; i<n; i++){
      weight[i] = sc.nextInt();
    }

    int maxLength = 0;
    int sum = 0;

    int start = 0;

    for(int i=0; i<n; i++){
      sum += weight[i];

      while(sum>w){
        sum -= weight[start];
        start++;
      }

      maxLength = Math.max(maxLength, (i - start + 1));
    }

    System.out.println(maxLength);
  }
}