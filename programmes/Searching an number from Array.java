import java.util.*;

public class work2 {
    public static void main(String[] args) {
        int f = 0, lb = 0, ub = 9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sorted array of 10 elements:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int b = sc.nextInt();

        while (lb <= ub) {
            int middle = (lb + ub) / 2;

            if (a[middle] == b) {
                f = 1;
                break; // number found, exit loop
            }

            if (a[middle] > b) {
                ub = middle - 1; // search in left half
            } else {
                lb = middle + 1; // search in right half
            }
        }

        if (f == 1)
            System.out.println("Number found");
        else
            System.out.println("Number not found");
    }
}
