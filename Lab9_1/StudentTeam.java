import java.util.Scanner;
public class StudentTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student("67100001", "AAA", 'f', 20, 3.32);
        Student student2 = new Student("67100002", "BBB", 'm', 21, 3.02);
        Student student3 = new Student("67100003", "CCC", 'm', 19, 2.55);

        System.out.println("Student Team");
        System.out.println("1. "+student1.toString());
        System.out.println("2. "+student2.toString());
        System.out.println("3. "+student3.toString());

        double avrAge = (student1.getAge()+student2.getAge()+student3.getAge())/3;
        double avrGpax = (student1.getGpax()+student2.getGpax()+student3.getGpax())/3;
        System.out.println("Average age: "+avrAge+", Average GPAX: "+ avrGpax);

        System.out.println("======= Change Gpax of 1st student =======");
        System.out.print("Enter new Gpax of 1st student: ");
        student1.setGpax(sc.nextDouble());
        System.out.println(student1.toString());
        System.out.println("======= Change age of 3st student =======");
        System.out.print("Enter new age of 3st student: ");
        student3.setAge(sc.nextInt());
        System.out.println(student3.toString());

        sc.close();
    }
}
