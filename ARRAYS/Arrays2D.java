import java.util.Scanner;

public class Arrays2D {
    static void display(int[][] arr, int r, int c) {
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
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
    }

    static int[][] multiplication(int[][] A, int[][] B, int r1, int c1, int r2, int c2) {
        int[][] ans = new int[r1][c2];
        if (r2 != c1) {
            System.out.println("Multiplication not possible !");
            return ans;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        return ans;
    }

    static int[][] addition(int[][] A, int[][] B, int r1, int c1, int r2, int c2) {
        int[][] ans = new int[r1][c2];
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not possible !");
            return ans;
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    ans[i][j] = A[i][j] + B[i][j];
                }
            }
        }
        return ans;
    }

    static int[][] transpose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] arr, int r, int c) {
        // only for square matrix
        int temp;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotation(int[][] arr, int r, int c) {
        int[][] ans = transpose(arr, r, c);
        reverseRow(ans, c, r);
        display(ans, c, r);
    }

    static void rotationSquare(int[][] arr, int r, int c) {
        if (r != c) {
            System.out.println("\nRotation not possible");
            return;
        }
        transposeInPlace(arr, r, c);
        reverseRow(arr, r, c);
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
        int[][] add = addition(arr, arr, r, c, r, c);
        display(add, r, c);
        int[][] mul = multiplication(arr, arr, r, c, r, c);
        display(mul, r, c);
        int[][] trans = transpose(arr, r, c);
        display(trans, c, r);
        if (r == c) {
            rotationSquare(arr, r, c);
        } else {
            rotation(arr, r, c);
        }
        sc.close();
        System.out.println("SpiC AD :)");
    }
}