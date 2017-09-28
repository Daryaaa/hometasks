/**
 * 27.09.2017
 * task DEV-9
 * Two strings are given. Replace a random group symbols from one string
 * by another random group symbols from another string.
 * Output is two original strings and one which was changed.
 */

public class EnterPoint {
  public static void main(String[] args) {
    StringChanges example = new StringChanges();
    Strings input = new Strings("abcdefgh1ijklmnop2qrstuvwxyz", "abcdefgh3ijklmnopq5rstuvwxyz");

    System.out.println(input.first);
    System.out.println(input.second);

    example.randomNumbers(input);
    System.out.println(input.first);
  }
}