import java.util.Scanner;

public class MathodCalGPA {
    public static char grading(double n){
        if(n>=80){
            return 'A';
        } else if(n>=70){
            return 'B';
        } else if(n>=60){
            return 'C';
        } else if(n>=50){
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int numGrading(char grade) {
        if (grade == 'A'){
            return 4;
        } else if (grade == 'B'){
            return 3;
        } else if (grade == 'C'){
            return 2;
        } else if (grade == 'D'){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = 0;

        System.out.print("Enter number of subject : ");
        int loop = sc.nextInt();
        
        for (int i=1; i<=loop; i++){
            System.out.printf("Enter Score of subject %d: ", i);
            double temp = sc.nextInt();
            char grade = grading(temp);

            System.out.print("Enter course unit : ");
            temp = sc.nextDouble(); //unit
            int num = numGrading(grade);
            gpa = gpa+(temp*num);

            System.out.println("Grade "+grade);
        }
        gpa = gpa/(loop-1);
        System.out.printf("GPA = %.2f", gpa);
    }
}
