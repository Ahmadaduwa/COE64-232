import java.util.Scanner;
public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.print("Enter width of 1st rectangle: ");
        rectangle1.setWidth(sc.nextInt());
        System.out.print("Enter height of 1st rectangle: ");
        rectangle1.setHeight(sc.nextInt());
        System.out.println("");

        System.out.print("Enter width of 2st rectangle: ");
        rectangle2.setWidth(sc.nextInt());
        System.out.print("Enter height of 2st rectangle: ");
        rectangle2.setHeight(sc.nextInt());
        System.out.println("");

        System.out.println("Display Rectangle Information");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println("");

        System.out.print("Enter new width of 1st rectangle: ");
        rectangle1.setWidth(sc.nextInt());
        System.out.print("Enter new width of 2st rectangle: ");
        rectangle2.setWidth(sc.nextInt());
        System.out.println("");

        System.out.println("Display Rectangle Information");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println("");

        sc.close();
    }
}
