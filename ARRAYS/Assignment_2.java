import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2 {
    static void input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }

    static void sortingBySign(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] arr1 = new int[count];
        int[] arr2 = new int[arr.length - count];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr1[j] = arr[i];
                j++;
            } else {
                arr2[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = arr1[i];
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = arr2[i - count];
        }
        display(arr);
    }
    static void kthSmallestInteger(int[] arr,int k){
        Arrays.sort(arr);
        System.out.println("\n"+k+"th smallest element is "+arr[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n);
        display(arr);
        sortingBySign(arr);
        kthSmallestInteger(arr, 6);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}