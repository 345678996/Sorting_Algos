import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n]  ;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
                sc.nextLine();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
    public static void bubbleSort(int[] arr, int n) {
        for (int i = n-1; i > 0; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }
    }
}

