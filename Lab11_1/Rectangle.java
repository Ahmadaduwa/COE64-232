package Lab11_1;

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        super("");
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double w, double h, String c){
        super(c);
        this.width = w;
        this.height = h;
    }

    public double getPerimeter() {  
        return (width+height)*2;
    }

    public double getArea() {  
        return width*height;
    }
    
    public String toString(){
        return "Color: "+color+" width: "+width+" height: "+height;
    }
}
