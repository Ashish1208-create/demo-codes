import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String jewels = sc.next();
    String stone = sc.next();

    HashSet<Character> hash = new HashSet<>();

    for(int i=0; i<jewels.length(); i++){
      hash.add(jewels.charAt(i));
    }

    int count =0;

    for(int i=0; i<stone.length(); i++){
      if(hash.contains(stone.charAt(i))) count++;
    }
   
      System.out.println(count);
    sc.close();
  }
}
