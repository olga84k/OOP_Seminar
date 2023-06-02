package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;

public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;
    public EmploeeService(){
        this.emploees = new ArrayList<Emploee>();
    }
    public List<Emploee> getAll(){
        return emploees;
    }
    @Override
    public void create(String fName, String sName, int age) {
        Emploee per = new Emploee(fName, sName, age, count);
        count++;
        emploees.add(per);
    }
}
