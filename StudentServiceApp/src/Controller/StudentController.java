package Controller;

import StudentDomen.Student;
import StudentService.StudentGrupService;
import StudentService.StudentService;

public class StudentController implements iuserController<Student>{
private final StudentService dataService = new StudentService();
private final StudentGrupService grupService = new StudentGrupService();
    @Override
    public void create(String fName, String sName, int age) {
        dataService.create(fName, sName, age);
        
    }
    
}
