import java.util.Scanner;
public class MyArray {
    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int sumArray(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static int maxArray(int[] a){
        int locate = 0;
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if (a[i]>max) {
                max = a[i];
                locate = i;
            }
        }
        return locate;
    }

    public static int max(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if (a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {59, 81, 73, 49, 53, 42, 64, 55, 61, 5};

        System.out.println("All Elements:");
        printArray(num);
        System.out.println("Summary : "+sumArray(num));
        System.out.println("Maximum elements is "+max(num)+" at array position "+maxArray(num));
        sc.close();
    }
}
