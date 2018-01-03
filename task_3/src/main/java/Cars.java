/**
 * This class define car, contains constructor and geters for car's fields.
 */

public class Cars {
  private String mark;
  private String model;
  private String type;
  private int price;

  public Cars(String mark, String model, String type, int price) {
    this.mark = mark;
    this.model = model;
    this.type = type;
    this.price = price;
  }

  public String getMark() {
    return this.mark;
  }

  public String getModel() {
    return this.model;
  }

  public String getType() {
    return this.type;
  }

  public int getPrice() {
    return this.price;
  }
}