package Lab11_2;
import java.util.ArrayList;

public class TestShapeObjact {

    public static void displayAllShape(ArrayList<Shape> o){
        System.out.println("Class Rectangle");
        for(int i=0; i<o.size(); i++){
            if(o.get(i).getClass().getName().equals("Lab11_2.Rectangle")){
                System.out.println("1. "+o.get(i).toString());
                System.out.println("Area: "+o.get(i).getArea()+" Perimeter: "+o.get(i).getPerimeter());
            } else {
                i = o.size();
            }
        }
        System.out.println("============================");
        System.out.println("Class Triangle");
        for(int i=0; i<o.size(); i++){
            if(o.get(i).getClass().getName().equals("Lab11_2.Trinangle")){
                System.out.println("1. "+o.get(i).toString());
                System.out.println("Area: "+o.get(i).getArea()+" Perimeter: "+o.get(i).getPerimeter());
            }
        }
        
    }

    public static int[] findMax(ArrayList<Shape> o){
        int[] max = new int[2];
        max[0] = 0; //Rectangles
        max[1] = 0; //Trinangle
        double triangle = o.get(0).getPerimeter();
        double rectangle = o.get(4).getPerimeter();

        for(int i=0; i<o.size(); i++){
            if((o.get(i) instanceof Rectangle && (o.get(i).getPerimeter() > rectangle))){
                max[0] = i;
                rectangle = o.get(i).getPerimeter();
            } else if(o.get(i) instanceof Trinangle && (o.get(i).getPerimeter() > triangle)){
                max[1] = i;
                triangle = o.get(i).getPerimeter();
            }
        }
        return max;
    }

    public static int[] findMin(ArrayList<Shape> o){
        int[] min = new int[2];
        min[0] = 0; //Rectangle
        min[1] = 0; //Trinangle
        double triangle = o.get(0).getPerimeter();
        double rectangle = o.get(4).getPerimeter();

        for(int i=0; i<o.size(); i++){
            if((o.get(i) instanceof Rectangle && (o.get(i).getPerimeter() < rectangle))){
                min[0] = i;
                rectangle = o.get(i).getPerimeter();
            } else if(o.get(i) instanceof Trinangle && (o.get(i).getPerimeter() < triangle)){
                min[1] = i;
                triangle = o.get(i).getPerimeter();
            }
        }
        return min;
    }

    public static void compare(ArrayList<Shape> o){
        System.out.println("============================");

        System.out.println("Compare 2 Rectangle after resize");
        if(o.get(0).compareTo(o.get(1))== 1) 
            System.out.println("Rectangle 1 is greater than Rentangle 2");
        else if(o.get(0).compareTo(o.get(1))== -1) 
        System.out.println("Rectangle 1 is lesser than Rentangle 2");
        else if(o.get(0).compareTo(o.get(1))== 0) 
        System.out.println("Rectangle 1 is equal Rentangle 2");

        System.out.println("Compare 2 Triangle after resize");
        if(o.get(3).compareTo(o.get(4))== 1) 
            System.out.println("Triangle 1 is greater than Triangle 2");
        else if(o.get(3).compareTo(o.get(4))== -1) 
        System.out.println("Triangle 1 is lesser than Triangle 2");
        else if(o.get(3).compareTo(o.get(4))== 0) 
        System.out.println("Triangle 1 is equal than Triangle 2");
    }


    public static void main(String[] args) {
        ArrayList<Shape> shape = new ArrayList<Shape>();
        shape.add(new Rectangle(4, 5, "Orange"));
        shape.add(new Rectangle(10, 5, "Orange"));
        shape.add(new Rectangle(5, 8, "Orange"));
        shape.add(new Trinangle(3, "Violet"));
        shape.add(new Trinangle(6, "Violet"));
        shape.add(new Trinangle(10, "Violet"));

        displayAllShape(shape);

//
       
        shape.get(1).resize(200);;
        shape.get(4).resize(50);;
          
        System.out.println("\n\nAfter");

        displayAllShape(shape);
        compare(shape);
    }
}
