import java.util.Scanner;

public class Multiplication {
    public static void displayMul(int n) {
        for (int i=1; i<=12; i++) {
            System.out.println(n+" x "+i+" = "+(i*n));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';
        while(ans == 'y') {
            System.out.print("Number [2 to 12] : ");
            int num1 = sc.nextInt();
            if (num1>=2 && num1<=12) {
                displayMul(num1);
                System.out.print("Do you want to continue [y/n]: ");
                ans = sc.next().charAt(0);
            } else {
                System.out.println("Invalid data, please try again.");
            }
        }
    }
}
