package Model;

public class Student extends User implements Comparable<Student> {
    private long StudentId;

    public Student(String fName, String sName, int age, long id) {
        super(fName, sName, age);
        this.StudentId = id;
    }

    public void setStudentId(long studentID) {
        this.StudentId = studentID;
    }

    public long getStudentId() {
        return StudentId;
    }

    @Override
    public String toString() {
        return "Student{"

                + "FirstName=" + super.getFirstName()
                + ", SecondName=" + super.getSecondName()
                + ", Age=" + super.getAge() +
                ", StudentId=" + StudentId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName()+"-"+o.getFirstName());
        if (super.getAge() == o.getAge()) {
             if (this.getStudentId() == o.getStudentId()) {
            return 0;
        }
    
        if (this.getStudentId() < o.getStudentId()) {
            return -1;
        }
        return 1;
    }
        if(super.getAge()<o.getAge())

    {
        return -1;
    }return 1;

    // if (this.getStudentId() == o.getStudentId()) {
    // return 0;
    // }

    // if (this.getStudentId() < o.getStudentId()) {
    // return -1;
    // }
    // return 1;
}}
