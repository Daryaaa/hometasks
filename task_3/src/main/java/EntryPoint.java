import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Comparator;

/**
 * This class allow to input cars from console, put in arrayList and sort it
 * and output sorted arrayList of cars on the screen.
 * Output - sorted list of input cars.
 */

public class EntryPoint {
  public static void main(String[] args) {
    final String ERROR_NOT_POSITIVE_MESSAGE = "Your number <= 0.";
    final String ERROR_NOT_NUMBER_MESSAGE = "You input a letter or a word.";
    final String TRY_AGAIN_MESSAGE = "Try again.";
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cars> cars = new ArrayList<Cars>();
    System.out.println("Input how many cars you want to input?");
    int amountCars = 0;
    while (amountCars <= 0) {
      try {
        amountCars = scanner.nextInt();
        if (amountCars <= 0) {
          System.out.println(ERROR_NOT_POSITIVE_MESSAGE + " " + TRY_AGAIN_MESSAGE);
        }
      } catch (InputMismatchException e) {
        System.out.println(ERROR_NOT_NUMBER_MESSAGE + " " + TRY_AGAIN_MESSAGE);
      }
      scanner.nextLine();
    }
      for (int i = 0; i < amountCars; i++) {
        System.out.println("Input mark");
        String mark = scanner.nextLine();
        System.out.println("Input model");
        String model = scanner.nextLine();
        System.out.println("Input type");
        String type = scanner.nextLine();
        System.out.println("Input price");
        int price = scanner.nextInt();
        while (price <= 0) {
          System.out.println(ERROR_NOT_POSITIVE_MESSAGE);
          price = scanner.nextInt();
        }
        scanner.nextLine();
        Cars car = new Cars(mark, model, type, price);
        cars.add(car);
      }

      Collections.sort(cars, Comparator.comparing(Cars::getPrice).thenComparing(Cars::getType)
                                       .thenComparing(Cars::getMark));
      for (Cars i : cars) {
        System.out.println(i.getMark() + " " + i.getModel() + " " + i.getType() +
            " " + i.getPrice());
      }
    }
  }