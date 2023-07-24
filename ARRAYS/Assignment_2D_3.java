import java.util.Scanner;

public class Assignment_2D_3 {
    static void MakePrefixSumArray(int[][] arr, int r, int c) {
        // row wise
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // column wise
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    static void display(int[][] arr) {
        System.out.println("\nThe matrix is :-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // Q->1: printing prefix sum array
        // System.out.print("Enter row : ");
        // int r = sc.nextInt();
        // System.out.print("Enter column : ");
        // int c = sc.nextInt();
        // int[][] arr = new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print("Enter element : ");
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // display(arr);
        // MakePrefixSumArray(arr, r, c);
        // display(arr);
        // // Q->2: perfect matrix
        // System.out.print("\nEnter index of square matrix : ");
        // int n=sc.nextInt();
        // int a[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("Enter element : ");
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        // display(a);
        // boolean check=IsPerfectMatrix(a, n);
        // System.out.println("perfect ? : "+check);
        //Q->3: printing upper triangular matrix
        System.out.print("\nEnter index of square matrix : ");
        int N=sc.nextInt();
        int b[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("Enter element : ");
                b[i][j]=sc.nextInt();
            }
        }
        display(b);
        upper(b, N);
        sc.close();
        System.out.println("\nSpiC AD :)");
    }

    static boolean IsPerfectMatrix(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i && arr[i][j]==0) return false;
                if(j==n-i-1 && arr[i][j]==0) return false;
                if(j!=i && j!=n-i-1 && arr[i][j]!=0) return false;
            }
        }
        return true;
    }

    static void upper(int[][] arr,int N){
        System.out.println("\nThe upper triangular matrix is :-");
        for (int i = 0; i < N; i++) {
            for (int j = N-1-i; j < N; j++) {
                System.out.print("\t");
            }
            for (int j = i; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
