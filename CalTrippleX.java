import java.util.Scanner;

public class CalTrippleX {
    public static void trippleX(int start, int stop) {
        for (int i=start; i<=stop; i++){
            System.out.println(i+" "+(int)Math.pow(i, 3));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';
        while(ans == 'y') {
            System.out.print("Enter n1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter n2: ");
            int num2 = sc.nextInt();
            if (num1<=num2) {
                System.out.println("x x*x*x");
                trippleX(num1, num2);
                ans = 'n';
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
