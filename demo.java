import java.util.*;

public class demo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> temp = new LinkedList<>();

    for(int i=0; i<n; i++){
        temp.add(sc.nextInt());
    }

    int mid = n/2;

   System.out.println(temp.get(mid));
  }
}