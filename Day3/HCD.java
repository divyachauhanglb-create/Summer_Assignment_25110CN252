import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, gcd = 1, i;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        for (i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}