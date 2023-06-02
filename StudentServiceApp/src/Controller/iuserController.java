package Controller;

import StudentDomen.User;

public interface iuserController<T extends User> {
    void create(String fName, String sName,int age);
}
