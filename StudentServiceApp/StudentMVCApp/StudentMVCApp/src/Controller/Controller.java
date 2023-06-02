package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Student;
import View.View;
import Model.Model;

public class Controller {
    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.model = model;
        this.view = view;
        this.students = new ArrayList<>();
    }

    public void getAllStudent() {
        students = model.getAllStudent();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void updateView() {
        // MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст");
        }

        // MVC
        // view.printAllStudent(model.getAllStudent());
    }

    private void getRemoveStudent() {
        students = model.getRemoveStudent();
    }

    public void run() {
        Commands com = Commands.NONE;
        boolean getNewItarator = true;
        while (getNewItarator) {
            String command = view.prompt("Введите команду");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewItarator = false;
                    System.out.println("Выход из программы!");
                case LIST:
                    getAllStudent();
                    updateView();
                case DELETE:
                    getRemoveStudent();
                    break;
            }
        }

    }

}
