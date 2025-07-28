import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
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
        mergesort(arr, 0, n-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
    public static void mergesort(int arr[], int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                    left++;
            }
            else {
                temp.add(arr[right]);
                    right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
