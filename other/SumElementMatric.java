import java.util.Scanner;
public class SumElementMatric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix row and column: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int all = row*column;
        System.out.print("Enter start number : ");
        int start = sc.nextInt();

        System.out.println("Display");
        int count = 0;
        int sum = 0;
        for (int i = start; i < start+all; i++) {
            System.err.print(i+" ");
            sum += i;
            if (++count == column) {
                System.out.println("");
                count = 0;
            }
        }
        System.out.println("Summary: "+sum);
        sc.close();
    }
}
