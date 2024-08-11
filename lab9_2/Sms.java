package lab9_2;

public class Sms {
    private String number;
    
    public Sms(){
        number="0";
    }

    public Sms(String number){
        this.number = number;
    }

    public void readAs(){
        System.out.print("Read as: ");
        for(int i=0; i<number.length(); i++){
            switch (number.charAt(i)) {
                case '0':
                    System.out.print("Zero ");
                    break;
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
                default:
                    break;
            }
        }
        System.out.println("");
    }

    public int[] calFreq(){
        int[] num = new int[10];

        for(int i=0; i<number.length(); i++){
            int numberOfChar = ((int) number.charAt(i))-48;
            num[numberOfChar]++;
        }
        return num;
    }

    public String toString(){
        return "SMS Number : "+number;
    }
}
