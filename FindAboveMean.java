import java.util.Scanner;

public class FindAboveMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';

        while(ans == 'y'){
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int num[] = new int[n];
            double mean = 0;

            System.out.println("Enter "+n+" numbers:");
            for(int i=0; i<n; i++){
                num[i] = sc.nextInt();
                mean += num[i];
            }
            mean = mean/n;
            System.out.printf("Mean : %.2f \n", mean);
            System.out.print("No. above mean as:");
            int sum=0;
            for(int i=0; i<n; i++){
                if(num[i]>mean){
                    System.out.print(" "+num[i]);
                    sum += 1;
                }
            }
            System.out.println("");
            System.out.println("Summary: "+sum);
            System.out.print("Do you want to continue [y/n]: ");
            ans = sc.next().charAt(0);
        }
        System.out.println("Bye Bye !!!");
        sc.close();
        
    }

}
