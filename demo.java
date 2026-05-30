import java.util.*;

public class demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().trim();

    // LinkedHashSet<String> res = new LinkedHashSet<>();

    // for (int i = 0; i < str.length(); i++) {
    //   int j = i + 1;
    //   String word = " ";

    //   while (j < str.length()) {
    //     if (str.charAt(j) == ' ') {
    //       word = str.substring(i, j);
    //       break;
    //     }
    //   }
    //   res.add(word);
    //   i = j + 1;
    // }

    String[] words = str.split("\\s+");


    for(int i=words.length-1; i>=0; i--){
      System.out.print(words[i] + " ");
    }
    sc.close();
  }
}
