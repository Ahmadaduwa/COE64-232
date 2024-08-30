package Lab12_1;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gadget> gadget;

    public Person(String n, int a){
        this.name = n;
        this.age = a;
        this.gadget = new ArrayList<Gadget>();
    }

    public void addGadget(Gadget g){
        gadget.add(g);
    }

    public ArrayList<Gadget> getGadget(){
        return gadget;
    }

    public void deleteGadget(int index){
        gadget.remove(index);
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Name: "+name+" Age "+age+" has +"+gadget.size()+" Gadgets";
    }
}
