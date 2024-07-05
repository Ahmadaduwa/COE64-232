import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Calculator (A, S, M, D)");
        System.out.println("========================================");
        System.out.println("Press A: Add");
        System.out.println("Press S: Subtract");
        System.out.println("Press M: Multiply");
        System.out.println("Press D: Divide\n");

        System.out.print("Press operator: ");
        char press = sc.next().charAt(0);
        press = Character.toUpperCase(press);

        System.out.print("Please enter x: ");
        double x = sc.nextInt();
        System.out.print("Please enter y: ");
        double y = sc.nextInt();

        double result;
        switch (press) {
            case 'A':
                result = x + y;
                System.out.println(x + " + " + y + " = " + result);
                break;
            case 'S':
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                break;
            case 'M':
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                break;
            case 'D':
                result = x / y;
                System.out.println(x + " / " + y + " = " + result);
                break;
            default:
                break;
        }
        System.out.println("Bye Bye !!!");
    }
}
