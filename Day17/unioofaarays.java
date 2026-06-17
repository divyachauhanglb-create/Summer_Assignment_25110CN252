import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union:");

        // Print unique elements of first array
        for (int i = 0; i < n1; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate)
                System.out.print(arr1[i] + " ");
        }

        // Print elements of second array not present in first
        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.print(arr2[i] + " ");
        }
    }
}