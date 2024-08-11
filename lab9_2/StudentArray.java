package lab9_2;
import java.util.Scanner;
public class StudentArray {

    static void printStudent(Student[] students){
        System.out.println("Student Team: 5 Persons");
        for(int i=0; i<students.length; i++){
            System.out.println((i+1)+". "+students[i].toString());
        }
    }

    static void gender(Student[] students){
        int countF = 0;
        int countM = 0;
        for(int i=0; i<students.length; i++){
            if(students[i].getGender()=='f'){
                countF++;
            } else if(students[i].getGender()=='m'){
                countM++;
            }
        }
        System.out.println("No. of Female: "+countF+", No. of Male: "+countM);
    }

    static void Age(Student[] students){
        double avgAge = 0;
        int minAge = students[0].getAge();
        int maxAge = students[0].getAge();
        for(int i=0; i<students.length; i++){
            if(students[i].getAge()<minAge){
                minAge = students[i].getAge();
            }
            if(students[i].getAge()>maxAge){
                maxAge = students[i].getAge();
            }
            avgAge += students[i].getAge();
        }
        avgAge = avgAge/students.length;
        System.out.println("Age Average: "+avgAge+", Min: "+minAge+", Max :" +maxAge);
    }

    static void Gpax(Student[] students){
        double avgGpax = 0;
        double minGpax = students[0].getGpax();
        double maxGpax = students[0].getGpax();
        for(int i=0; i<students.length; i++){
            if(students[i].getGpax()<minGpax){
                minGpax = students[i].getGpax();
            }
            if(students[i].getGpax()>maxGpax){
                maxGpax = students[i].getGpax();
            }
            avgGpax += students[i].getGpax();
        }
        avgGpax = avgGpax/students.length;
        System.out.println("GPAX Average: "+avgGpax+", Min: "+minGpax+", Max :" +maxGpax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        students[0] = new Student("67100001", "AAA", 'f', 20, 3.23);
        students[1] = new Student("67100002", "BBB", 'm', 21, 3.02);
        students[2] = new Student("67100003", "CCC", 'm', 19, 2.55);
        students[3] = new Student("67100004", "DDD", 'm', 21, 3.52);
        students[4] = new Student("67100005", "FFF", 'f', 20, 3.55);

        printStudent(students);
        Age(students);
        Gpax(students);
        gender(students);

        System.out.println("=======================================");
        sc.close();
    }
    
}