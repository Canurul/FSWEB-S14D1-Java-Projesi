package Company;
import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name,
                     JuniorDeveloper[] juniorDeveloper,
                     MidDeveloper[] midDeveloper,
                     SeniorDeveloper[] seniorDeveloper) {
        super(id, name);
        this.juniorDevelopers = juniorDeveloper;
        this.midDevelopers = midDeveloper;
        this.seniorDevelopers = seniorDeveloper;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDevelopers){
        try{
            if(this.juniorDevelopers[index] == null){
                this.juniorDevelopers[index] = juniorDevelopers;

            }else{
                System.out.println("index is full");
            }

        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("index not found" + index);
        }

    }
    public void addEmployee(int index, MidDeveloper midDevelopers){
        try{
            if(this.midDevelopers[index] == null){
                this.midDevelopers[index] = midDevelopers;

            }else{
                System.out.println("index is full");
            }

        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("index not found" + index);
        }

    }
    public void addEmployee(int index, SeniorDeveloper seniorDevelopers){
        try{
            if(this.seniorDevelopers[index] == null){
                this.seniorDevelopers[index] = seniorDevelopers;

            }else{
                System.out.println("index is full");
            }

        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("index not found" + index);
        }

    }

    @Override
    public void work() {
        super.setSalary(Salaries.HRMANAGER.getSalary());
        System.out.println(getName()+ "HRmanager started working");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
