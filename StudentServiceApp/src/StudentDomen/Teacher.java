package StudentDomen;

public class Teacher extends User{
    private int teacherId;
    private String degree;
    public Teacher(String fName, String sName, int age, int teacherId, String degree) {
        super(fName, sName, age);
        this.teacherId = teacherId;
        this.degree = degree;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public String getDegree() {
        return degree;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

}
