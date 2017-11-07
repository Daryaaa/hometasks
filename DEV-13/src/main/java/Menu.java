import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
  private int customerMoney;
  private int customerProductivity;
  private int criterion;

  /**
   * This method work with customer, ask input data we are nedeed.
   */
  public void inputData() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Put money:");
    customerMoney = scanner.nextInt();
    System.out.println("Put productivity:");
    customerProductivity = scanner.nextInt();
    System.out.println("Put criterion:");
    criterion = scanner.nextInt();
  }

  /**
   * This method choose method which will count specialists that are nedeed customer.
   */
  public void chooseCountMethod() {
    switch (criterion) {
      case 1:
        firstCriterion();
        break;
      case 2:
        secondCriterion();
        break;
      case 3:
        thirdCriterion();
        break;
      default:
       break;
    }
 }

  /**
   * Here we create specialists using SpecialistBulder.
   */
Specialist junior = new SpecialistBuilder()
    .buildProductivity(1000)
    .buildSalary(500)
    .buildName("junior")
    .build();
  Specialist middle = new SpecialistBuilder()
      .buildProductivity(2500)
      .buildSalary(1000)
      .buildName("middle")
      .build();
  Specialist senior = new SpecialistBuilder()
      .buildProductivity(6000)
      .buildSalary(2500)
      .buildName("senior")
      .build();
  Specialist lead = new SpecialistBuilder()
      .buildProductivity(8500)
      .buildSalary(4000)
      .buildName("lead")
      .build();

  /**
   * This method sort spesialists by productivity per dollar.
   * @return array sorted specialists.
   */
  private Specialist[] getSortedByProductivity() {
    Specialist[] unsorted = {lead, senior, middle, junior};
    Arrays.sort(unsorted, new Comparator<Specialist>() {
      public int compare(Specialist a, Specialist b) {
        return (int)(a.getProductivityPerDollar() - b.getProductivityPerDollar());
      }
    });
    return unsorted;
  }

  /**
   * This method count specialists that are nedeed customer by criterion:
   * "Get max productivity in fix money"
   */
  private void firstCriterion() {
    int finalProductivity = 0;
    int countFirstType = 0;
    int countSecondType = 0;
    int countThirdType = 0;
    int countForthType = 0;
    Specialist[] sorted = getSortedByProductivity();
    while (customerMoney > sorted[3].getSalary()) {
      if (customerMoney >= sorted[0].getSalary()) {
        customerMoney -= sorted[0].getSalary();
        finalProductivity += sorted[0].getProductivity();
        countFirstType++;
      } else if (customerMoney < sorted[0].getSalary() && customerMoney >= sorted[1].getSalary()) {
        customerMoney -= sorted[1].getSalary();
        finalProductivity += sorted[1].getProductivity();
        countSecondType++;
      } else if (customerMoney < sorted[1].getSalary() && customerMoney >= sorted[2].getSalary()) {
        customerMoney -= sorted[2].getSalary();
        finalProductivity += sorted[2].getProductivity();
        countThirdType++;
      } else if (customerMoney < sorted[2].getSalary() && customerMoney >= sorted[3].getSalary()) {
        customerMoney -= sorted[3].getSalary();
        finalProductivity += sorted[3].getProductivity();
        countForthType++;
      }
      if (customerMoney < sorted[3].getSalary()) {
        break;
      }
    }
    if (finalProductivity < customerProductivity) {
      System.out.println("Sorry, we cannot help you");
    } else {
      StringBuilder answer = new StringBuilder();
      answer.append(sorted[0].getName());
      answer.append(" ");
      answer.append(countFirstType);
      answer.append(",");
      answer.append(sorted[1].getName());
      answer.append(" ");
      answer.append(countSecondType);
      answer.append(",");
      answer.append(sorted[2].getName());
      answer.append(" ");
      answer.append(countThirdType);
      answer.append(",");
      answer.append(sorted[3].getName());
      answer.append(" ");
      answer.append(countForthType);
      answer.append(".");
      System.out.println(answer);
    }
  }

  /**
   * This method count specialists that are nedeed customer by criterion:
   * "Get min money wiht fix productivity".
   */
  private void secondCriterion() {
    int countFirstType = 0;
    int countSecondType = 0;
    int countThirdType = 0;
    int countForthType = 0;
    Specialist[] sorted = getSortedByProductivity();
    while (customerProductivity > sorted[3].getProductivity()) {
      if (customerProductivity >= sorted[0].getProductivity()) {
        customerProductivity -= sorted[0].getProductivity();
        customerMoney -= sorted[0].getSalary();
        countFirstType++;
      } else if (customerProductivity < sorted[0].getProductivity() && customerProductivity >= sorted[1].getProductivity()) {
        customerProductivity -= sorted[1].getProductivity();
        customerMoney -= sorted[1].getSalary();
        countSecondType++;
      } else if (customerProductivity < sorted[1].getProductivity() && customerProductivity >= sorted[2].getProductivity()) {
        customerProductivity -= sorted[2].getProductivity();
        customerMoney -= sorted[2].getSalary();
        countThirdType++;
      } else if (customerProductivity < sorted[2].getProductivity() && customerProductivity >= sorted[3].getProductivity()) {
        customerProductivity -= sorted[3].getProductivity();
        customerMoney -= sorted[3].getSalary();
        countForthType++;
      }
      if (customerProductivity < sorted[3].getProductivity()) {
        break;
      }
    }
    if (customerMoney < 0) {
      System.out.println("Sorry, we cannot help you");
    } else if (customerProductivity != 0) {
      System.out.println("Sorry, we cannot help you");
    } else {
      StringBuilder answer = new StringBuilder();
      answer.append(sorted[0].getName());
      answer.append(" ");
      answer.append(countFirstType);
      answer.append(",");
      answer.append(sorted[1].getName());
      answer.append(" ");
      answer.append(countSecondType);
      answer.append(",");
      answer.append(sorted[2].getName());
      answer.append(" ");
      answer.append(countThirdType);
      answer.append(",");
      answer.append(sorted[3].getName());
      answer.append(" ");
      answer.append(countForthType);
      answer.append(".");
      System.out.println(answer);
    }
  }

  /**
   * This method count specialists that are nedeed customer by criterion:
   * "Get min number non-junior specialists with fix productivity".
   * TODO rethink algorithm
   */
  private void thirdCriterion() {
    int countFirstType = 0;
    int countSecondType = 0;
    int countThirdType = 0;
    int countForthType = 0;
    Specialist[] sorted = getSortedByProductivity();
    if (customerMoney < sorted[3].getSalary()) {
      System.out.println("Sorry, we cannot help you");
    }
    while (customerMoney >= sorted[3].getSalary()) {
      customerMoney -= sorted[3].getSalary();
      customerProductivity -= sorted[3].getProductivity();
      countForthType++;
    }
    if (customerProductivity != 0) {
      System.out.println("Sorry, we cannot help you");
    }
    StringBuilder answer = new StringBuilder();
    answer.append(sorted[0].getName());
    answer.append(" ");
    answer.append(countFirstType);
    answer.append(",");
    answer.append(sorted[1].getName());
    answer.append(" ");
    answer.append(countSecondType);
    answer.append(",");
    answer.append(sorted[2].getName());
    answer.append(" ");
    answer.append(countThirdType);
    answer.append(",");
    answer.append(sorted[3].getName());
    answer.append(" ");
    answer.append(countForthType);
    answer.append(".");
    System.out.println(answer);
  }
}