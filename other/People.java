public class People {

    private int id;
    private String name;

    public People() { 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public String toString() {
        return "People{" + "id=" + id + ", name=" + name + '}';
    }
}
