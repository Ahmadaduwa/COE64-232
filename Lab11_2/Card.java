package Lab11_2;

public class Card implements Tossable {
    private int number;

    public Card(){
        this.number = 0;
    }

    public void toss(){
        this.number = (int) (Math.random()*9)+1;
    }

    public int getNumber(){
        return number;
    }
}
