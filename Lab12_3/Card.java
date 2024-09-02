public class Card {
    private String cardNo;
    private String pin;

    public Card(String no, String pin){
        this.cardNo = no;
        this.pin = pin;
    }

    public boolean isValid(String no, String pin){
        if(this.cardNo.equals(no) && this.pin.equals(pin)){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return "Card No. "+cardNo+" and pin is "+pin;
    }
}
