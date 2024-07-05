import java.util.Scanner; 
import java.lang.Math;
public class NumberOfHour { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of seconds : ");
        int num = sc.nextInt();

        int seconds = num % 60;
        int temp = num / 60;

        int minute = temp % 60;
        int hour = temp / 60;

        System.out.println(num +" seconds is approximately "+ hour +" hours, "+ minute +" minute and "+ seconds +" seconds");
    }
}