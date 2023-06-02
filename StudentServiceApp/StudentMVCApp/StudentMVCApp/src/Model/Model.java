package Model;
import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;{
        for(Student person: students){
            System.out.println(person);
        }
    }
    public Model(List<Student> students) {
    }
    public List<Student> getAllStudent() {
        return students;
    }
    public List<Student> getRemoveStudent(){
        String number = "0";
        System.out.println("Введите номер студента: " + number);
         Long.parseLong(number);
         for(Student pers: students){
         if (pers.getStudentId() == Long.parseLong(number) ) {
            students.remove(pers);
         }
         else{
            System.out.println("Студента с таким номером нет"); 
    }
            
}
        return students;
    }
}