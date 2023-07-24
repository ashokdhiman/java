import java.util.Scanner;

public class prefix_sum {
    static void display(int[] arr, int n) {
        System.out.println("\nThe array entered is :-");
        for (int i = 1; i < n + 1; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean check(int[] arr) {
        int sum = sum(arr);
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int suffix = sum - prefix;
            if (suffix == prefix) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            System.out.print("\nEnter the element : ");
            arr[i] = sc.nextInt();
        }
        display(arr, n);
        int[] prefixSum = prefixSum2(arr);
        System.out.print("\nEnter number of queries you want to ask : ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter l : ");
            int l = sc.nextInt();
            System.out.print("Enter r : ");
            int r = sc.nextInt();
            System.out.println("The sum is : " + (prefixSum[r] - prefixSum[l - 1]));
        }
        boolean check = check(arr);
        System.out.println("Equal partition possible : " + check);
        sc.close();
        System.out.println("SpiC AD :)");
    }

    static int[] prefixSum2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}