package Model;

public class User {
    private String FirstName;
    private String SecondName;
    private int Age;
    public User(String fName, String sName, int age){
        this.FirstName= fName ;
        this.SecondName = sName;
        this.Age = age;
    }
    public void setFirstName(String value){
        this.FirstName = value;
    }
    public void setSecondName(String value){
        this.SecondName = value;
    }

    public String getFirstName(){ 
        return FirstName;
    }
    public String getSecondName(){ 
        return SecondName;
    }
    public void setAge(int value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        this.Age = value;
    }
    public int getAge(){ 
        return Age;
    }
    @Override
    public String toString(){
        return "User{" +
        "firstName='" + FirstName + '\'' +
        ", secondName='" + SecondName + '\'' +
        ", age=" + Age +
        '}';
    }


}
