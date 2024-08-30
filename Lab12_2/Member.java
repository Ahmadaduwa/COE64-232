package Lab12_2;

public class Member {
    private String name;
    private int age;
    private String ID;

    public Member(String n,int a,String id){
        this.name = n;
        this.age = a;
        this.ID = id;
    }

    public String toString(){
        return "ID: "+ID+" Name: "+name+" Age: "+age;
    }

    public String getID(){
        return ID;
    }
}
