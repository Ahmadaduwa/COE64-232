import java.util.Scanner; 
import java.lang.Math;
public class RGBColorDifference { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("RGB Color1 : ");
        int r1 = sc.nextInt();
        int g1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.print("RGB Color2 : ");
        int r2 = sc.nextInt();
        int g2 = sc.nextInt();
        int b2 = sc.nextInt();


        double d = Math.sqrt(Math.pow(r2-r1,2)+Math.pow(g2-g1,2)+Math.pow(b2-b1,2));

        System.out.println("Color Difference = "+d);
    }
}