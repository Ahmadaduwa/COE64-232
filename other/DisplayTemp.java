import java.util.Scanner;
public class DisplayTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] temp = new int[12];
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i=0; i<temp.length; i++) {
            System.out.print("Please enter temp of "+month[i]+": ");
            temp[i] = sc.nextInt();
        }

        int max = temp[0];
        int locate_max = 0;
        int min = temp[0];
        int locate_min = 0;
        for (int i=1; i<temp.length;i++){
            if(temp[i]>max) {
                max = temp[i];
                locate_max = i;
            }
            if (temp[i]<min){
                min = temp[i];
                locate_min = i;
            }
        }
        System.out.println("Maximun temp is "+ max +" and "+ max +" is a temp of "+ month[locate_max]);
        System.out.println("Minimum temp is "+ min +" and "+ min +" is a temp of "+ month[locate_min]);
        sc.close();
    }
}
