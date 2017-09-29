public class EnterPoint {
  public static void main(String[] args) {
    StringChanges example = new StringChanges();
    try {
      example.randomNumbers(args);
    } catch (IllegalArgumentException e){
      System.out.println("Your input isn't correct, you must put only 2 arguments.");
    }
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(example.randomNumbers(args));
  }
}