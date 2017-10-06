public class EnterPoint {
  public static void main(String[] args) {
    Transliteration example = new Transliteration();
    try{
      System.out.println(example.convert("щит"));
    } catch (IllegalArgumentException e) {
      System.out.println("String is empty");
    }
  }
}