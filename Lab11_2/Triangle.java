package Lab11_2;

class Trinangle extends Shape{
    private double width;

    public Trinangle(){
        this.width = 0;
    }

    public Trinangle(double w, String c){
        super(c);
        this.width = w;
    }

    public double getPerimeter() {  
        return width*3;
    }

    public double getArea() {  
        return Math.pow(3, 0.5)/4*Math.pow(width, 2);
    }
    
    public String toString(){
        return "Color: "+color+" width: "+width;
    }

    public void resize(int percent){
        this.width = width*percent/100;
    }

    

    public int compareTo(Shape o){
        if (getArea() > ((Trinangle) o).getArea())
            return 1;
        else if (getArea() < ((Trinangle) o).getArea())
            return -1;
        else 
            return 0;
    }
}
