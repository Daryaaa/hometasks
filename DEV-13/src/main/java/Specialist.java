/**
 * This class describe spesialists.
 */
public class Specialist {
  private int productivity;
  private int salary;
  String name;

  public void setProductivity(int productivity) {
    this.productivity = productivity;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getProductivity() {
    return this.productivity;
  }

  public int getSalary() {
    return this.salary;
  }

  public String getName() {
    return this.name;
  }

  public double getProductivityPerDollar() {
    return this.productivity / this.salary;
  }
}