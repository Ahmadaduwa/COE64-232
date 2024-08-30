package lab10_1;
import java.util.Scanner;

public class DisplayPerson {
    public static void displayAll(Person[] o){

        System.out.println("No. of "+ o.getClass().getName()+" = "+o.length);
        for(int i=0; i<o.length; i++){
            System.out.println((i+1)+" "+o[i].toString());
        }
        System.out.println("Average age "+calAverageAge(o));
    }
    public static double calAverageAge(Person[] o){
        double age = 0;
        for(int i=0; i<o.length ;i++){
            age += o[i].getAge();
        }
        age = age/o.length;
        return age;
    }
    public static void change(Person[] o, String name, int b){
        for(int i=0; i<o.length; i++){
            if(o[i].getName().equals(name)){
                o[i].setBirthYear(b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[2];
        persons[0] = new Person("xxx xxx", 1977);
        persons[1] = new Person("zzz yyy", 1974);
        Student[] students = new Student[2];
        students[0] = new Student("Aaa bbb", 2000, "67100010", "COE");
        students[1] = new Student("DDD ddd", 2000, "67100011", "CPE");
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("zzz zzz", 1977, false, 28000);
        employees[1] = new Employee("ddd fff", 1970, true, 40000);

        displayAll(persons);
        displayAll(students);
        displayAll(employees);

        System.out.println("===============================================");
        System.out.print("Change information of name : ");
        String name = sc.nextLine();
        System.out.print("Change birthyear to : ");
        int year = sc.nextInt();
        change(persons, name, year);
        change(students, name, year);
        change(employees, name, year);
        System.out.println("===============================================");

        displayAll(persons);
        displayAll(students);
        displayAll(employees);

        sc.close();
    }
}
