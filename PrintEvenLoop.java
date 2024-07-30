import java.util.Scanner;

public class PrintEvenLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.print("Enter start number: ");
            int startNumber = sc.nextInt();
            if (startNumber % 2 == 1) {
                startNumber += 1;
            }
            int count = 0;
            for (int i = startNumber; i < startNumber + 20; i += 2) {
                System.out.print(i + " ");
                if (count % 5 == 4) {
                    System.out.println("");
                }
                count++;
            }

            System.out.print("Do you want to enontinue [y/n]: ");
            char ask = sc.next().charAt(0);
            switch (ask) {
                case 'y':
                    break;
                case 'n':
                    start = false;
                    System.out.println("Bye Bye !!!");
                    break;
                default:
                    System.out.print("Do you want to enontinue [y/n]: ");
                    ask = sc.next().charAt(0);
                    break;
            }
        }
        sc.close();
    }
}
