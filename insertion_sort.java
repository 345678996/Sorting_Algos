import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
                sc.nextLine();
            int[] arr = new int[n];
        System.out.println("Enter each elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
                sc.nextLine();
        }
        InsertionSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
    public static void InsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
                while (j > 0 && arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    j--;
                }

        }
    }
}
