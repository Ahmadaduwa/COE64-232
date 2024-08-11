package lab9_2;
import java.util.Scanner;

public class SMSDemoArray {

    static void digit(Sms sms){
        int[] numArray = sms.calFreq();
        System.out.println("Digit Summary");
        for(int j=0; j<numArray.length; j++){
            if (numArray[j] != 0){
                System.out.print(j+" ");
                for(int k=0; k<numArray[j]; k++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of sms number: ");
        int num = sc.nextInt();
        
        Sms[] sms = new Sms[num];

        for(int i=0; i<num; i++){
            System.out.print("Enter sms number "+(i+1)+" : ");
            sms[i] = new Sms(sc.next());
        }
        for(int i=0; i<num; i++){
            System.out.println((i+1)+". "+sms[i].toString());
            sms[i].readAs();
            digit(sms[i]);

            System.err.println("");
        }
        System.err.println("Bye Bye!!!");
        
        sc.close();
    }
}
