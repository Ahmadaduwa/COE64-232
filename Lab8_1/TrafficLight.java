public class TrafficLight {
    private String color;
    TrafficLight(){
        this.color = "green";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void change() {
        if (color.equals("green")) {
            color = "yellow";
        } else if (color.equals("yellow")) {
            color = "red";
        } else if (color.equals("red")) {
            color = "green";
        }
    }

    public String toString(){
        return "The light is "+color+" now";
    }

}
