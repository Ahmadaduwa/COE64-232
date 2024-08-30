package lab10_1;
import java.util.Calendar;

public class Person {
    protected String name;
    protected int birthYear;

    public Person(){
        name="";
        birthYear=0;
    }

    public Person(String name, int year){
        this.name = name;
        this.birthYear = year;
    }

    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-birthYear-543;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int b){
        this.birthYear = b;
    }

    public String toString(){
        return "Name: "+name+", Birth Year: "+birthYear+", Age: "+(getAge());
    }
}