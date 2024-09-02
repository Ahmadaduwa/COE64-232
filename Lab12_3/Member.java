public class Member {
    private String name;
    private int age;
    private String ID;
    private final Card card;

    public Member(String n,int a,String id, Card c){
        this.name = n;
        this.age = a;
        this.ID = id;
        this.card = c;
    }

    public String getID(){
        return ID;
    }

    public Card getCard(){
        return card;
    }

    public String toString(){
        return "ID: "+ID+" Name: "+name+" Age: "+age;
    }
}
