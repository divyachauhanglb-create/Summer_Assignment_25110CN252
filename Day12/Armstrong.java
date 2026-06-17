import java.util.Scanner;

class Main {

    static boolean armstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (armstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}