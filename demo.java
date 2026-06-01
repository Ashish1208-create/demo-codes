import java.util.*;

public class demo {

  public static int countVowel(String str) {
    int vowel = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
          || str.charAt(i) == 'u')
        vowel++;
    }
    return vowel;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] names = new String[n];

    for (int i = 0; i < n; i++) {
      names[i] = sc.next();
    }

    Arrays.sort(names, (a, b) -> {
      int va = countVowel(a);
      int vb = countVowel(b);

      if (va != vb)
        return vb - va;

      if (a.length() != b.length())
        return a.length() - b.length();

      return a.compareTo(b);
    });

    for (String name : names) {
      System.out.println(name);
    }

    sc.close();
  }
}
