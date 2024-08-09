import java.util.Scanner; 
public class TriangleArea { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 

        double s = 0.5*(a+b+c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area = "+area);
        sc.close();
    }
}