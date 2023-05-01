import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] counts = new int[100];
        
        System.out.print("Enter the integers between 1 and 100: ");
        
        for (int num = input.nextInt(); num != 0; num = input.nextInt()) {
            for (int i = 0; i < counts.length; i++) {
                if (num == i + 1) {
                    counts[i]++;
                    break;
                }
            }
        }
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i+1) + " occurs " + counts[i] + " time(s)");
            }
        }
        
      
    }
}
