package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;

    public TeacherService(int count, List<Teacher> teachers) {
        this.count = count;
        this.teachers = teachers;
    }

    public TeacherService() {
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String fName, String sName, int age) {
        Teacher per =  new Teacher(fName, sName, age, count, sName);
        count++;
        teachers.add(per);

    }
    public List<Teacher> getSortedByFIOSTeachers(int number){
    List<Teacher>teachers = new ArrayList<>();
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }
}
