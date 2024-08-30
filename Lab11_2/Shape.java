package Lab11_2;

abstract class Shape implements Comparable, Resizable{
    protected String color;
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String toString();


    public Shape(){
        this.color = "";
    }

    public Shape(String c){
        this.color = c;
    }

    public void setColor(String c){
        this.color = c;
    }

}
