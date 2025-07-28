import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
                sc.nextLine();
            int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                    sc.nextLine();
            }
        SelectionSort(arr, n);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
    public static void SelectionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int mini = i; // Considering 1st element is the smallest
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
}

