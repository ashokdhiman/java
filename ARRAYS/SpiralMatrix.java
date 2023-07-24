import java.util.Scanner;

public class SpiralMatrix {
    static void display(int[][] arr, int r, int c) {
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void spiralTraversal(int[][] arr, int r, int c) {
        System.out.println("The spiral order traversal is : ");
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int count = 0;
        int Elements = r * c;
        while (count < Elements) {
            // Top Row
            for (int j = leftCol; j <= rightCol && count < Elements; j++) {
                System.out.print(arr[topRow][j] + "\t");
                count++;
            }
            topRow++;
            // right col
            for (int i = topRow; i <= bottomRow && count < Elements; i++) {
                System.out.print(arr[i][rightCol] + "\t");
                count++;
            }
            rightCol--;
            // bottom row
            for (int j = rightCol; j >= leftCol && count < Elements; j--) {
                System.out.print(arr[bottomRow][j] + "\t");
                count++;
            }
            bottomRow--;
            // left col
            for (int i = bottomRow; i >= topRow && count < Elements; i--) {
                System.out.print(arr[i][leftCol] + "\t");
                count++;
            }
            leftCol++;
        }
        System.out.println();
    }

    static int[][] makeSpiralArray(int n){
        int[][] ans=new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int count = 1;
        while (count <=n*n) {
            // Top Row
            for (int j = leftCol; j <= rightCol && count <= n*n; j++) {
                ans[topRow][j]=count++;
            }
            topRow++;
            // right col
            for (int i = topRow; i <= bottomRow && count <= n*n; i++) {
                ans[i][rightCol]=count++;
            }
            rightCol--;
            // bottom row
            for (int j = rightCol; j >= leftCol && count <= n*n; j--) {
                ans[bottomRow][j]=count++;
            }
            bottomRow--;
            // left col
            for (int i = bottomRow; i >= topRow && count <= n*n; i--) {
                ans[i][leftCol]=count++;
            }
            leftCol++;
        }
        return ans;
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
        spiralTraversal(arr, r, c);
       // Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int[][] ans=makeSpiralArray(n);
        display(ans, n, n);
        System.out.println();
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
