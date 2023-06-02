package StudentService;

import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;

public class AverageAge<T extends User> {
    public static double calculate(List<T> people) {
        int studentCount = 0;
        int teacherCount = 0;
        int emploeeCount = 0;
        int studentAgeSum = 0;
        int teacherAgeSum = 0;
        int emploeeAgeSum = 0;

        for (T person : people) {
            if (person instanceof Student) {
                studentCount++;
                studentAgeSum += person.age;
            } else if (person instanceof Teacher) {
                teacherCount++;
                teacherAgeSum += person.age;
            } else if (person instanceof Emploee) {
                emploeeCount++;
                emploeeAgeSum += person.age;
            }
        }

        double studentAverageAge = studentCount == 0 ? 0 : (double) studentAgeSum / studentCount;
        double teacherAverageAge = teacherCount == 0 ? 0 : (double) teacherAgeSum / teacherCount;
        double emploeeAverageAge = emploeeCount == 0 ? 0 : (double) emploeeAgeSum / emploeeCount;

        System.out.println("Student average age: " + studentAverageAge);
        System.out.println("Teacher average age: " + teacherAverageAge);
        System.out.println("Emploee average age: " + emploeeAverageAge);

        return 0;
    } 
}    