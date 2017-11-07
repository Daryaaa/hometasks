public class EnterPoint {
  public static void main(String[] args) {
    Menu menu = new Menu();
    try {
      menu.inputData();
    } catch (IllegalArgumentException e) {
      System.out.println("Wrong input values.");
    }
    menu.chooseCountMethod();
  }
}