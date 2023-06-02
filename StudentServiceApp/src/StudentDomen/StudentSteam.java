package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGrup> {
    private List<StudentGrup> grups;
    private int SteamId;
    public StudentSteam(StudentGrup grup1, int SteamId) {
        this.grups = grups;
        this.SteamId = SteamId;
    }
    public List<StudentGrup> getStudentGrup() {
        return grups;
    }

    public void setStudentGrup(List<StudentGrup> grups) {
        this.grups = grups;
    }

    public int getSteamId(){
        return SteamId;
    }
    public void setSteamid(int SteamId){
       this.SteamId = SteamId;
    }
    @Override
    public Iterator<StudentGrup> iterator() {
        return grups.iterator();
    }
    
}
