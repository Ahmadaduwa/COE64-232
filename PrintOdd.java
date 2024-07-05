public class PrintOdd {
    public static void main(String[] args) {
        int count = 0;

        for (int i=1; i<20; i=i+2) {
            System.err.print(i+" ");
            count++;
            if (count == 2) {
                System.err.println("");
                count = 0;
            }
        }
    }
}