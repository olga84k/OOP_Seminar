package Controller;

import StudentDomen.Emploee;
import StudentService.EmploeeService;
import StudentDomen.User;

public class EmploeeController implements iuserController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String fName, String sName, int age) {
        empService.create(fName, sName, age);
    }

    static public <T> void paySalary(T person) {
        System.out.println(((User) person).getFirstName()+" зп 200000р ");
    }
    static public <T extends Number> double mean(T[] num){
        double sum = 0.0;
        for(int i = 0; i<num.length;i++){
            sum = sum + num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
        
    }



}
