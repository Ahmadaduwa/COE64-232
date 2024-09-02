import java.util.Scanner;
import java.util.ArrayList;

public class CardVarification {

    static void display(Shop m) {
        System.out.println(m.toString());
        for (int i = 0; i < m.getMember().size(); i++) {
            System.out.println((i + 1) + " " + m.getMember().get(i).toString());
            System.out.println(" "+m.getMember().get(i).getCard().toString());
        }
        System.out.println();
    }

    static void checkID(String id, ArrayList<Shop> m, Scanner sc){
        boolean checkFound = false;
        boolean checkCard = false;
        int[] locate = new int[2];
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < m.get(i).getMember().size(); j++) {
                if(m.get(i).getMember().get(j).getID().equals(id)){
                    System.out.println("Valid member id");
                    checkFound = true;
                    checkCard = checkCard(m.get(i).getMember().get(j).getCard(), sc); //(card, shopName, member)
                    locate[0] = i;
                    locate[1] = j;
                }
            }
        }
        if (!checkFound) {
            System.out.println("Invalid member id");
        } else {
            if (checkCard){
                System.out.println("This card belongs to Shop: "+m.get(locate[0]).getName());
                System.out.println(m.get(locate[0]).getMember().get(locate[1]).toString());
            } else {
                System.out.println("Invalid Card");
            }
        }
    }

    static boolean checkCard(Card card, Scanner sc){
        System.out.print("Please enter card no: ");
        String no = sc.next();
        System.out.print("Please enter pin no: ");
        String pin = sc.next();
        boolean valid = card.isValid(no, pin);
        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';

        ArrayList<Member> member1 = new ArrayList<Member>();
        member1.add(new Member("AAA", 20, "67100100", new Card("5648", "1234")));
        member1.add(new Member("BBB", 22, "67100200", new Card("5649", "1234")));
        member1.add(new Member("DDD", 20, "67100400", new Card("5651", "1234"))); //

        ArrayList<Member> member2 = new ArrayList<Member>();
        member2.add(new Member("CCC", 21, "67100300", new Card("5650", "1234")));
        member2.add(new Member("EEE", 21, "67100500", new Card("5652", "1234")));

        ArrayList<Shop> shops = new ArrayList<Shop>();
        shops.add(new Shop("Adidas", member1));
        shops.add(new Shop("On", member2));

        System.out.println();
        display(shops.get(0));
        display(shops.get(1));

        System.out.println("Welcome to Card Verification");
        System.out.println("===============================");
        while (ans == 'y') {
            System.out.print("Enter membet id: ");
            String id = sc.next();
            checkID(id, shops, sc);

            System.out.println();
            System.out.print("continue [y/n]: ");
            ans = sc.next().charAt(0);
            System.out.println("===============================");
        }

        System.out.println();
        System.out.println("Bye Bye !!!");
        sc.close();
    }
}
