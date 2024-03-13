package Company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(Salaries.SENIOR.getSalary());
        System.out.println(getName()+ " started working");
    }
}
