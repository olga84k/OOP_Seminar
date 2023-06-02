package StudentDomen;

import java.util.List;

import StudentService.iUserService;

public class Emploee extends User {
    private int empId;

    public Emploee(String fName, String sName, int age, int empId) {
        super(fName, sName, age);
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    
}
