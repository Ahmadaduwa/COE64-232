import java.util.Scanner;

public class PassOrFailMethod {
    public static boolean isPass(int s1, int s2, int s3){
        if(s1<50 || s2<50 || s3<50) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while (num < 3) {
            System.out.print("Enter score of student "+ num +": ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            boolean pass = isPass(num1, num2, num3);
            if (pass) {
                double mean = (num1+num2+num3)/3.0;
                System.out.printf("Mean = %.2f , ", mean);
                if (mean>85){
                    System.out.println("Grade A");
                } else if (mean>65){
                    System.out.println("Grade B");
                } else if (mean>49){
                    System.out.println("Grade C");
                } else {
                    System.out.println("Grade D");
                }
                num++;
            } else {
                System.out.println("Fail");
            }
        }
        
    }
}
