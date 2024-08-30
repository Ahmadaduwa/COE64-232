package Lab11_2;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super("");
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double w, double h, String c) {
        super(c);
        this.width = w;
        this.height = h;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return "Color: " + color + " width: " + width + " height: " + height;
    }

    public void resize(int percent) {
        this.width = width * percent / 100;
    }

    public int compareTo(Shape o) {
        if (getArea() > ((Rectangle) o).getArea())
            return 1;
        else if (getArea() < ((Rectangle) o).getArea())
            return -1;
        else
            return 0;
    }
}
