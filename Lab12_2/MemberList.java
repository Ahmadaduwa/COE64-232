package Lab12_2;

import java.util.Scanner;
import java.util.ArrayList;

public class MemberList {

    static void display(Shop m) {
        System.out.println(m.toString());
        for (int i = 0; i < m.getMember().size(); i++) {
            System.out.println((i + 1) + " " + m.getMember().get(i).toString());
        }
    }

    static void displayShop(ArrayList<Shop> s, String name) {
        boolean found = false;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getName().equals(name)){
                display(s.get(i));
                found = true;
            }
        }
        if (!found){
            System.out.println("Not Found");
        } 
    }

    static void displayMemberId(ArrayList<Shop> s, String name) {
        boolean found = false;
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).getMember().size(); j++) {
                if (s.get(i).getMember().get(j).getID().equals(name)){
                    System.out.println(s.get(i).getMember().get(j).toString());
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Not Found");
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';

        ArrayList<Member> member1 = new ArrayList<Member>();
        member1.add(new Member("AAA", 20, "67100100"));
        member1.add(new Member("BBB", 22, "67100200"));
        member1.add(new Member("DDD", 20, "67100400")); //

        ArrayList<Member> member2 = new ArrayList<Member>();
        member2.add(new Member("CCC", 21, "67100300"));
        member2.add(new Member("EEE", 21, "67100500"));

        ArrayList<Shop> shops = new ArrayList<Shop>();
        shops.add(new Shop("Adidas", member1));
        shops.add(new Shop("On", member2));

        System.out.println();
        display(shops.get(0));
        display(shops.get(1));
        System.out.println();
        /*
         * ArrayList<Member> member3 = new ArrayList<Member>();
         * member3.add(shops.get(0).getMember().get(2));
         * shops.get(0).deleteMember(2);
         * shops.add(new Shop("Hoka", member3));
         * 
         * display(shops.get(0));
         * display(shops.get(1));
         * display(shops.get(2));
         * System.out.println();
         */

        while (ans == 'y') {
            System.out.println("Search Menu");
            System.out.println("1: Bu Shop");
            System.out.println("2: By Member Id");
            System.out.print("Enter: ");
            int num = sc.nextInt();
            String name;;
            switch (num) {
                case 1:
                    System.out.print("Enter shop: ");
                    name = sc.next();
                    displayShop(shops, name);
                    break;
                case 2:
                    System.out.print("Enter member id: ");
                    name = sc.next();
                    displayMemberId(shops, name);
                    break;
                default:
                    break;
            }

            System.out.print("continue [y/n]: ");
            ans = sc.next().charAt(0);
            System.out.println("===============================");
        }

        System.out.println("Bye Bye !!!");
        sc.close();
    }
}
