/**
 * Created by Dasha on 06.11.2017.
 */
public class EnterPoint {
  public static void main(String[] args) {
    Specialist junior = new SpecialistBuilder()
        .buildProductivity(1000)
        .buildSalary(500)
        .build();
    Specialist middle = new SpecialistBuilder()
        .buildProductivity(2500)
        .buildSalary(1000)
        .build();
    Specialist senior = new SpecialistBuilder()
        .buildProductivity(6000)
        .buildSalary(2500)
        .build();
    Specialist lead = new SpecialistBuilder()
        .buildProductivity(8000)
        .buildSalary(4000)
        .build();
  }
}
