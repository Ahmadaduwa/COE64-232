import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter 3 numbers");
        System.out.print("no. 1 : ");
        int n1 = sc.nextInt();
        System.out.print("no. 1 : ");
        int n2 = sc.nextInt();
        System.out.print("no. 1 : ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.err.println(n1+" is the smallest");
        } else if (n2 < n3 && n2 < n1) {
            System.err.println(n2+" is the smallest");
        } else if (n3 < n2 && n3 < n1) {
            System.err.println(n3+" is the smallest");
        }
        sc.close();
    }
}