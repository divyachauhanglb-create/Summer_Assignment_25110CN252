import java.util.Scanner;

public class Nthfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1, c = 0;

        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        if (n == 1)
            System.out.println("Nth Fibonacci term is: " + a);

        else if (n == 2)
            System.out.println("Nth Fibonacci term is: " + b);

        else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci term is: " + c);
        }
    }
}