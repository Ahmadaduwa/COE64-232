import java.util.Scanner;
public class PrintCubic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int num = sc.nextInt();

        for (int i = num; i<num+11; i++) {
            System.err.print(i+" "+(int)Math.pow(i, 3)+"\n");
        }
        sc.close();
    }

}
