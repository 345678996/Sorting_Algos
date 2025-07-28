import java.util.Arrays;
import java.util.Scanner;

public class quick_sort {
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
        quickSort(arr, 0, n-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
            return j;
    }
}
