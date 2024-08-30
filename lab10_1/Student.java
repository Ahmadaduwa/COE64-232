package lab10_1;

public class Student extends Person{
    protected String studentID;
    protected String major;

    public Student(){
        studentID = "";
        major = "";
    }

    public Student(String n, int y, String id, String m){
        super(n,y);
        this.studentID = id;
        this.major = m;
    }

    public String getSID() {
        return studentID;
    }

    public String toString(){
        return super.toString()+", Student Id: "+studentID+", Major: "+major;
    }
}
