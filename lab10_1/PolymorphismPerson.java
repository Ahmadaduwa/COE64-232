package lab10_1;

import java.util.ArrayList;

public class PolymorphismPerson {
    public static void displayAll(ArrayList<Person> p, String type) {
        System.out.println(type);
        type = "lab10_1." + type;
        double age = 0;
        int size = 0;
        double salary = 0;
        int s = 0;
        int num = 1;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getClass().getName().equals(type)) {
                System.out.println((num++) + " " + p.get(i).toString());
                age += p.get(i).getAge();
                size++;
            }
            if (p.get(i) instanceof Employee) {
                salary += ((Employee) p.get(i)).getSalary();
                s++;
            }
        }
        System.out.println("Average age " + age / size);
        if (type.equals("lab10_1.Employee"))
            System.err.println("Average salary " + salary/s);

    }

    public static void change(ArrayList<Person> o, String name, int b) {
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getName().equals(name)) {
                o.get(i).setBirthYear(b);
            }
        }
    }

    public static void remove(ArrayList<Person> o, String name) {
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getName().equals(name)) {
                o.remove(i);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("xxx xxx", 1977));
        persons.add(new Person("zzz yyy", 1974));

        persons.add(new Student("Aaa bbb", 2000, "67100010", "COE"));
        persons.add(new Student("DDD ddd", 2000, "67100011", "CPE"));

        persons.add(new Employee("zzz zzz", 1977, false, 28000));
        persons.add(new Employee("ddd fff", 1970, true, 40000));

        displayAll(persons, "Person");
        displayAll(persons, "Student");
        displayAll(persons, "Employee");

        System.out.println("===============================================");
        change(persons, "zzz zzz", 1975);
        remove(persons, "ddd fff");
        persons.add(new Person("BBB ZZZ", 1990));

        displayAll(persons, "Person");
        displayAll(persons, "Student");
        displayAll(persons, "Employee");
    }
}
