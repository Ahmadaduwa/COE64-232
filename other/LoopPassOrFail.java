import java.util.Scanner;
public class LoopPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';

        while (ans == 'y') {
            System.out.print("Enter score1 (1-100): ");
            int s1 = sc.nextInt();
            System.out.print("Enter score2 (1-100): ");
            int s2 = sc.nextInt();
            System.out.print("Enter score3 (1-100): ");
            int s3 = sc.nextInt();
            if (s1 < 50 || s2 < 50 || s3 < 50){
                System.out.println("Fail");
            } else {
                int mean = (s1+s2+s3)/3;
                System.out.println("Mean = "+ mean);
                if (mean >= 86) {
                    System.out.println("Grade A");
                } else if (mean >= 66) {
                    System.out.println("Grade B");
                } else if (mean >= 50 ) {
                    System.out.println("Grade C");
                }
            }
            System.out.print("Do you want to continue [y/n]: ");
            ans = sc.next().charAt(0);
        }
        System.out.println("Bye Bye !!!");
        sc.close();
    }
}
