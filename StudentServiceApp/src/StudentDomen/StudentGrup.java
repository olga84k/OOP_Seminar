package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGrup implements Iterable<Student> {
    private List<Student> students;

    public StudentGrup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGrupIterator(students);
    }
    
}
