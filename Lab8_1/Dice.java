public class Dice {
    private int number;
    Dice() {
        roll();
    }

    public void roll() {
        number = (int) (Math.random() * 6) + 1;
    }

    public int getNumber() {
        return number;
    }
}
