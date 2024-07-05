import java.util.Scanner;

public class ProcessInteger {
    public static void main(String[] args) {
        int sumodd = 0, sumeven = 0, max, min;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers [Exit press number <=0 ]: ");
        int ans = sc.nextInt();
        max = ans;
        min = ans;

        while (ans > 0) {
            if (ans % 2 == 1) { // odd
                sumodd += ans;
            } else {
                sumeven += ans;
            }
            if (ans < min) {
                min = ans;
            }
            if (ans > max) {
                max = ans;
            }
            ans = sc.nextInt();
        }

        System.out.println("Summary of odd number : " + sumodd);
        System.out.println("Summary of even number: " + sumeven);
        System.out.println("Maximun number :" + max);
        System.out.println("Minimun number :" + min);
    }
}
