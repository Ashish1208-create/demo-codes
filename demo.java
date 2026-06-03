import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> attLinkedList = new LinkedList<>();

    for(int i=0; i<n; i++){
      int temp = sc.nextInt();
      attLinkedList.add(temp);
    }
    
    System.out.println(attLinkedList);

    Collections.reverse(attLinkedList);
    for(int x : attLinkedList){
      System.out.print(x + " ");
    }
    sc.close();

  }
}
