public class EntryPoint {
  public static void main(String[] args) {
    PathValidator pathValidator = new PathValidator();
    pathValidator.isPathValid(args[0]);
  }
}