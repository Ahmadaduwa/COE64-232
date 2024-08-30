public class Accounts {

    private int type;
    private String name;
    private double balance;

    public Accounts() { 
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Accounts{" + "type=" + type + ", name=" + name + ", balance=" + balance + '}';
    }
}
