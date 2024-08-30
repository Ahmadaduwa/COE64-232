
import java.util.Scanner;

public class MethodDisplay {
    public static void printNum(int n1, int n2, int n3) {
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                for(int k=0; k<n3; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of loop: ");
        int loop = sc.nextInt();
        for(int i=0; i<loop; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            printNum(n1, n2, n3);
        }
        sc.close();
    }
}
