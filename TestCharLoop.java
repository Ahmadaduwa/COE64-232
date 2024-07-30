import java.util.Scanner;
public class TestCharLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of loop: ");
        int loop = sc.nextInt();

        for (int i=0; i<loop; i++){
            System.out.print("Any character: ");
            char word = sc.next().charAt(0);
            if (((int)word >= 97 && (int)word <= 122) || ((int)word >= 65 && (int)word <= 90)) { //
                word = Character.toUpperCase(word);
                switch (word) {
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        System.out.println(word+" is a vowel.");
                        break;
                    default:
                        System.out.println(word+" is a consonant.");
                        break;
                }
            } else if ((int)word >= 48 && (int)word <= 57) {
                System.out.println(word+" is a number.");
            } else {
                System.out.println(word+" is a Sepecial character.");
            }
            
        }
        System.out.println("Bye Bye!!");
        sc.close();
    }
}
