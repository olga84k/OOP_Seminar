import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controller.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGrup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Федор", " Тор", 20);
        System.out.println(u1);
        Student s1 = new Student("Олег", "Иванов", 19, 23);
        System.out.println(s1);
        Student s2 = new Student("Дима", "Сидоров", 30, 45);
        Student s3 = new Student("Олег", "Жданов", 19, 25);
        Student s4 = new Student("Ольга", "Иванова", 45, 201);
        List<Student> liststud1 = new ArrayList<Student>();
        List<Student> liststud2 = new ArrayList<Student>();
        liststud1.add(s1);
        liststud1.add(s2);
        liststud2.add(s3);
        liststud2.add(s4);
        StudentGrup grup1 = new StudentGrup(liststud1);
        StudentGrup grup2 = new StudentGrup(liststud2);
        Collections.sort(grup1.getStudents());

        for (Student stud : grup1) {
            System.out.println(stud);
        }
        System.out.println(grup1);
        StudentSteam steam1 = new StudentSteam(grup1, 1);
        StudentSteam steam2 = new StudentSteam(grup2, 2);

        Emploee person1 = new Emploee("Иванов", "Олег", 055, 19);
        //EmploeeController contrEmp = new EmploeeController();
        //contrEmp.paySalary(person1);
        EmploeeController.paySalary(person1);
Integer studHour[] = {124,234,231,1,45};
System.out.println(EmploeeController.mean(studHour));

    }
    List<User> people = new ArrayList<>();
people.add(new Student1("Олег", "Жданов", 34, 001));
people.add(new Teacher("Alice", 35, "Math"));
people.add(new Emploee("Bob", 25, "Engineer"));
people.add(new Student2("Mary", 22, 2));
people.add(new Student3("Peter", 19, 1));

AverageAge.calculate(people);   
}