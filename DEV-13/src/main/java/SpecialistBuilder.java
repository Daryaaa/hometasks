/**
 * This class is builder class for specialist.
 */
public class SpecialistBuilder {
  private int productivity = 0;
  private int salary = 0;
  private String name = null;

  SpecialistBuilder buildProductivity(int productivity) {
    this.productivity = productivity;
    return this;
  }
  SpecialistBuilder buildSalary(int salary) {
    this.salary = salary;
    return this;
  }
  SpecialistBuilder buildName(String name) {
    this.name = name;
    return this;
  }
  Specialist build() {
    Specialist specialist = new Specialist();
    specialist.setProductivity(productivity);
    specialist.setSalary(salary);
    specialist.setName(name);
    return specialist;
  }
}