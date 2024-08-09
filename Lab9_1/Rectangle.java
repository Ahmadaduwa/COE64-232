public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        width = 0;
        height = 0;
    }

    public Rectangle(int w, int h){
        setWidth(w);
        setHeight(h);
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public int calArea(){
        int area = height*width;
        return area;
    }

    public int calPerimeter(){
        int perimeter = (height*2) + (width*2);
        return perimeter;
    }

    public String toString(){
        return "Rectangle width = "+width+", height = "+height+", Area = "+calArea()+", Perimeter = "+calPerimeter();
    }
}
