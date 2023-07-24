import java.util.Scanner;

public class Assignment_2D_1 {
    static void display(int[][] arr, int r, int c) {
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void search(int[][] arr, int r, int c, int x) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == x) {
                    System.out.println("row :" + i);
                    System.out.println("column :" + j);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    static int[][] tranform(int[] arr, int m, int n) {
        int[][] ans = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr[k];
                k++;
            }
        }
        return ans;
    }

    static void sum(int[][] arr, int r, int c, int[][] range) {
        int sum = 0;
        int i = range[0][0];
        while (i <= range[0][1]) {
            int j = range[1][0];
            while (j <= range[1][1]) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        System.out.println("The sum is : " + sum);
    }

    static void reverseRow(int[][] arr, int r, int c) {
        int temp;
        int i = 0;
        while (i < r) {
            int st = 0;
            int end = c - 1;
            while (st < end) {
                temp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }
            i++;
        }
        display(arr, r, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int r = sc.nextInt();
        System.out.print("Enter column number : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element : ");
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr, r, c);
        // Q-1..................
        System.out.print("Enter the number you want to search : ");
        int x = sc.nextInt();
        search(arr, r, c, x);
        // Q-2.............................
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            A[i] = sc.nextInt();
        }
        System.out.print("Enter m :");
        int a = sc.nextInt();
        System.out.print("Enter n :");
        int b = sc.nextInt();
        int[][] ans = tranform(A, a, b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }
        // Q-3.................................
        int[][] range = new int[2][2];
        System.out.println("Enter range : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element : ");
                range[i][j] = sc.nextInt();
            }
        }
        sum(arr, r, c, range);
        // Q-4.................................
        reverseRow(arr, r, c);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}