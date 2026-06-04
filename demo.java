import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> first = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      first.add(temp);
    }
    int m = sc.nextInt();
    LinkedList<Integer> second = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      int temp = sc.nextInt();
      second.add(temp);
    } 

    HashSet<Integer> set = new HashSet<>(second);

    for (int x : first) {
      if (set.contains(x)) {
        System.out.println(x);
        return;
      }
    }
    System.out.println(-1);
    return;

  }
}
