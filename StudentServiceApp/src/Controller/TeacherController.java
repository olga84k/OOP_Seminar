package Controller;

import StudentDomen.Teacher;
import StudentService.TeacherService;
import StudentDomen.User;

public class TeacherController implements iuserController<Teacher> {
    private final TeacherService empService = new TeacherService();


    @Override
    public void create(String fName, String sName, int age) {
        empService.create(fName, sName, age);
    }

    static public <T> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 200000р ");
    }

    static public <T extends Number> double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;

    }

}
