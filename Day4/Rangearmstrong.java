import java.util.Scanner;

public class Rangearmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;

        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int num = start; num <= end; num++) {

            int originalNum = num;
            int remainder;
            int result = 0;

            while (originalNum != 0) {
                remainder = originalNum % 10;
                result = result + (remainder * remainder * remainder);
                originalNum = originalNum / 10;
            }

            if (result == num) {
                System.out.print(num + " ");
            }
        }
    }
}