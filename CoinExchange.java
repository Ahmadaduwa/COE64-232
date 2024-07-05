import java.util.Scanner; 
import java.lang.Math;
public class CoinExchange { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Coin 10 Baht : ");
        int b10 = sc.nextInt();
        System.out.print("Coin 5 Baht : ");
        int b5 = sc.nextInt();
        System.out.print("Coin 2 Baht : ");
        int b2 = sc.nextInt();
        System.out.print("Coin 1 Baht : ");
        int b1 = sc.nextInt();

        int total = (b10*10)+(b5*5)+(b2*2)+(b1);
        System.out.println("Total : "+total);

        int b1000 = total/1000;
        total = total%1000;
        int b500 = total/500;
        total = total%500;
        int b100 = total/100;
        total = total%100;
        int temp = total;

        int b50 = total/50;
        total = total%50;
        int b20 = total/20;
        total = total%20;
        if (total != 0) {
            total = temp;
            b50 = 0;
            b20 = total/20;
        }

        System.out.println("Bank 1000 Baht : "+b1000);
        System.out.println("Bank 500 Baht : "+b500);
        System.out.println("Bank 100 Baht : "+b100);
        System.out.println("Bank 50 Baht : "+b50);
        System.out.println("Bank 20 Baht : "+b20);
    }
}