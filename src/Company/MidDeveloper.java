package Company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        super.setSalary(Salaries.MID.getSalary());
        System.out.println(getName()+ " started working");
    }
}
