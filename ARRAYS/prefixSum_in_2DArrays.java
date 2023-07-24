import java.util.Scanner;

public class prefixSum_in_2DArrays {
    static void display(int[][] arr, int r, int c) {
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
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
        System.out.print("Enter l1 : ");
        int l1 = sc.nextInt();
        System.out.print("Enter r1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter l2 : ");
        int l2 = sc.nextInt();
        System.out.print("Enter r2 : ");
        int r2 = sc.nextInt();

        // Given a matrix 'a' of dimension n*m and 2 coordinates(l1,r1) and (l2,r2).
        // Return the sum of the rectangle from (l1,r1) to (l2,r2).
        int sum = findSum(arr, r, c, l1, l2, r1, r2);
        System.out.println("\nSum is : " + sum);

        // pre-calculating the horizontal sum for each row int the matrix
        int sum2 = findSum2(arr, r, c, l1, l2, r1, r2);
        System.out.println("\nSum is : " + sum2);

        //prefix sum over rows and columns both 
        int sum3=findSum3(arr, r, c, l1, l2, r1, r2);
        System.out.println("\nSum is : " + sum3);

        sc.close();
        System.out.println("SpiC AD :)");
    }

    static int findSum(int[][] arr, int m, int n, int l1, int l2, int r1, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static void prefixSumRowWise(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }
    static void prefixSumcolumnWise(int arr[][], int r, int c) {
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    static int findSum2(int[][] arr, int r, int c, int l1, int l2, int r1, int r2) {
        int sum = 0;
        prefixSumRowWise(arr, r, c);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += (arr[i][r2] - arr[i][r1 - 1]);
            } else {
                sum += arr[i][r2];
            }
        }
        return sum;
    }

    static int findSum3(int[][] arr, int r, int c, int l1, int l2, int r1, int r2){
        prefixSumRowWise(arr, r, c);
        prefixSumcolumnWise(arr, r, c);
        int sum=0,left=0,up=0,upleft=0;
        sum=arr[l2][r2];
        if(l1>=1)
            up=arr[l1-1][r2];
        if(r1>=1)
            left=arr[l2][r1-1];
        if(l1>=1 && r1>=1)
            upleft=arr[l1-1][r1-1];

        return sum-up-left+upleft;
    }

}
