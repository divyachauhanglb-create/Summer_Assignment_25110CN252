import java.util.Scanner;

class Main {

    static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (palindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}