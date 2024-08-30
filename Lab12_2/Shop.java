package Lab12_2;
import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Member> s;
    
    public Shop(String n, ArrayList<Member> s){
        this.name = n;
        this.s = s;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Member> getMember(){
        return s;
    }

    public void addMember(Member s){
        this.s.add(s);
    }

    public void deleteMember(int index){
        this.s.remove(index);
    }

    public String toString(){
        return "Shop "+name+": "+s.size()+" members";
    }
}
