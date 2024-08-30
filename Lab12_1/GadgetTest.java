package Lab12_1;
import java.util.Scanner;

public class GadgetTest {
    static void display(Person p){
        System.out.println(p.toString());
        for (int i = 0; i < p.getGadget().size(); i++) {
            System.out.println((i+1)+" "+p.getGadget().get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        Person[] person = new Person[2];
        person[0] = new Person("AAA", 16);
        person[0].addGadget(new Gadget("Smartphone", "Huawei", 20000));
        person[0].addGadget(new Gadget("Notebook", "Apple", 40000));
        
        person[1] = new Person("BBB", 16);
        person[1].addGadget(new Gadget("Notebook", "Acer", 30000));
        person[1].addGadget(new Gadget("Smartphone", "Apple", 40000));
        person[1].addGadget(new Gadget("Tablet", "Apple", 35000));

        System.out.println();
        display(person[0]);
        display(person[1]);

        System.out.println("\nSelect Menu");
        System.out.println("1 Add gadget");
        System.out.println("2 Delete gadget");
        System.out.println("3 Exit");
        System.out.println("================");



        while(ans != 3) {
            System.out.print("Select: ");
            ans = sc.nextInt();
            int found = -1;
            int index = -1;

            switch (ans) {
                case 1:
                    System.out.print("Enter gadget info: ");
                    String gadget = sc.next();
                    String brand = sc.next();
                    int price = sc.nextInt();

                    System.out.print("Enter name: ");
                    String name = sc.next();


                    for (int i = 0; i < person.length; i++) {
                        if(person[i].getName().equals(name)){  //found
                            index = i;
                            int check = 0;
                            for (int j = 0; j < person[i].getGadget().size(); j++) { 
                                if (person[i].getGadget().get(j).getBrand().equals(brand) && person[i].getGadget().get(j).getName().equals(gadget) && person[i].getGadget().get(j).getPrice() == price) {
                                    found = 2;
                                    check = 1;
                                    System.out.println("Duplicate gadget name\n");
                                }
                            }
                            if (check==0){
                                found = 1;
                                person[i].addGadget(new Gadget(gadget, brand, price));
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter gadget name: ");
                    gadget = sc.next();

                    System.out.print("Enter name: ");
                    name = sc.next();

                    for (int i = 0; i < person.length; i++) {
                        if(person[i].getName().equals(name)){
                            index = i;
                            for (int j = 0; j < person[i].getGadget().size(); j++) {
                                if(person[i].getGadget().get(j).getName().equals(gadget)){
                                    System.out.println("Delete completed");
                                    person[i].deleteGadget(j);
                                    found = 1;
                                }
                            }
                            if (found == -1){
                                System.out.println("Gadget name not found\n");
                                found = 0;
                            }
                        }
                    }
                    break;
                default:
                    break;
            }

            if(found == 1){
                display(person[index]);
            } else if (found == -1){
                System.out.println("Name Not Found\n"); 
            }
        }
        System.out.println("Bye Bye !!!");
        
        sc.close();
        
    }
}
