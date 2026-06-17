import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter required sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
                }

            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}