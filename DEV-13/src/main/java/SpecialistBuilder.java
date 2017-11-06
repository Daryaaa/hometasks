/**
 * Created by Dasha on 06.11.2017.
 */
public class SpecialistBuilder {
  private int productivity = 0;
  private int salary = 0;

  SpecialistBuilder buildProductivity(int productivity) {
    this.productivity = productivity;
    return this;
  }
  SpecialistBuilder buildSalary(int salary) {
    this.salary = salary;
    return this;
  }
  Specialist build() {
    Specialist specialist = new Specialist();
    specialist.setProductivity(productivity);
    specialist.setSalary(salary);
    return specialist;
  }
}
