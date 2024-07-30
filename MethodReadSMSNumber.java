import java.util.Scanner;
public class MethodReadSMSNumber {
    public static void readSMS(String sms){
        System.out.print("Read as: ");
        for(int i=0; i<sms.length(); i++) {
            char ans = sms.charAt(i);
            switch (ans) {
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = 'y';
        while(a == 'y') {
            System.out.print("SMS Number: ");
            String number = sc.next();
            readSMS(number);
            System.out.println("Do you want to continue [y/n]: ");
            a = sc.next().charAt(0);
        }
        sc.close();
    }  
}
