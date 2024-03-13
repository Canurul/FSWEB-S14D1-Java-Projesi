package Company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(Salaries.JUNIOR.getSalary());
        System.out.println(getName()+ " started working");
    }

}
