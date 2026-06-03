import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   int days = sc.nextInt();
   int minDay = sc.nextInt();
   int minHours = sc.nextInt();

    int[] hours = new int[days];

    for(int i=0; i<days; i++){
      hours[i] = sc.nextInt();
    }

    int maxSum = 0;

    for(int i=0; i<minDay; i++){
      maxSum += hours[i];
    }
    
    int windowSum = maxSum;

    for(int i=minDay; i<days; i++){
      windowSum += hours[i] - hours[i-minDay]; 
      maxSum = Math.max(maxSum, windowSum);
    }

    System.out.println(maxSum);
    System.out.println(maxSum > minHours ? "YES" : "NO");

    sc.close();
  }
}
