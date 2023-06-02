package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGrup;
import StudentDomen.UserComparator;

public class StudentGrupService {
   private List<StudentGrup>grups;

public StudentGrupService() {
    this.grups = new ArrayList<>();
}
public List<StudentGrup> getAll(){
   return this.grups;
}
public List<Student> getSortedByFIOSStudentGrup(int numberGrup){
    List<Student>students = new ArrayList<>(grups.get(numberGrup).getStudents());
    students.sort(new UserComparator<Student>());
    return students;
}

}
