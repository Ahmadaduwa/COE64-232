import java.util.Scanner;

public class ConsOrVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char character = sc.next().charAt(0);
        character = Character.toUpperCase(character);

        switch (character) {
            case 'A':case 'E':case 'I':case 'O':case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        sc.close();
    }
}
