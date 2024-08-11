package lab9_2;
public class Student {
    private String id;
    private String name;
    private int age;
    private char gender;
    private double gpax;

    public Student(){
        id = "0";
        name = " ";
        age = 0;
        gender = '0';
        gpax = 0.0;
    }

    public Student(String id, String name, char gender, int age, double gpax) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.gpax = gpax;
    }

    public double getGpax() {
        return gpax;
    }

    public void setGpax(double g){
        this.gpax = g;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a){
        this.age = a;
    }

    public String toString(){
        String gen = " ";
        if(gender == 'm'){
            gen = "Male";
        } else if (gender == 'f'){
            gen = "Female";
        }
        return id+", "+name+", "+gen+", Age"+age+", Gpax "+gpax;
    }
    
}
