package Lab12_1;

public class Gadget {
    private String name;
    private String brand;
    private int price;

    public Gadget(String name, String brand, int price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return name+", Brand "+brand+", "+price+" Baht";
    }
}
