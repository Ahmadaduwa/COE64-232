import java.util.Scanner;

public class DiceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();

        char ans = 'y';
        while (ans == 'y') {
            System.out.print("Enter n: ");
            int num = sc.nextInt();
            double win = 0;

            for (int i = 0; i < num; i++) {
                int number1 = dice1.getNumber();
                int number2 = dice2.getNumber();
                int number3 = dice3.getNumber();
                int sum = number1 + number2 + number3;

                System.out.print(number1 + " " + number2 + " " + number3 + " ");
                dice1.roll();
                dice2.roll();
                dice3.roll();

                if (sum > 5 && sum < 13) {
                    System.out.println("Between 6 and 12");
                    win++;
                } else {
                    System.out.println("Out of Range");
                }
            }
            win = win / (double) num * 100;
            System.out.println("Percentage " + win + "%");
            System.out.print("Do you want to continue [y/n]: ");
            ans = sc.next().charAt(0);
        }
        System.out.println("Bye Bye !!!");

        sc.close();
    }
}
