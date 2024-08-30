package Lab11_2;
import java.util.Scanner;
public class TossableObject {
    public static void main(String[] args) {
        Card[] random = new Card[5];
        for (int j = 0; j < 5; j++)
            random[j] = new Card();
        Scanner sc = new Scanner(System.in);
        char ans = 'y';


        while (ans == 'y'){
            int sum = 0;
            int success = 0;
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            System.out.println("Card information");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    random[j].toss();
                    sum += random[j].getNumber();
                    System.out.print(random[j].getNumber()+" ");
                }
                if(sum>10 && sum<19){
                    System.out.println("summary is between 10 and 19");
                    sum = 0;
                    success = success+1;
                } else {
                    System.out.println("summary is Out of Range");
                    sum = 0;
                }
            }
            System.out.println("Percentage "+(success/(double)n*100)+"%");
            System.out.println("Do you want to continue [y/n]: ");
            ans = sc.next().charAt(0);
            
        }
        sc.close();
    }
}
