import java.util.Scanner; 
import java.lang.Math;
public class ManhattanDistance { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("P1(x,y): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("P2(x,y): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d = Math.abs(x1-x2)+Math.abs(y1-y2);
        System.out.println("Manhattan Distance = "+(int)d);
        sc.close();
    }
}