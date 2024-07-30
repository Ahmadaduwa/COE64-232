import java.util.Scanner; 
import java.lang.Math;
public class EuclideanDistance { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double x = x2-x1;
        x = Math.pow(x, 2);
        double y = y2-y1;
        y = Math.pow(y, 2);
    
        double d = Math.sqrt(x+y);

        System.out.println(d);
        sc.close();
    }
}