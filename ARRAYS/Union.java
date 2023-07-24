import java.util.Scanner;

public class Union {
    static void display(int[] arr) {
        System.out.println("\n");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr1[i] = sc.nextInt();
        }
        display(arr1);
        System.out.print("\nEnter the size of array 2 : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element : ");
            arr2[i] = sc.nextInt();
        }
        display(arr2);
        int[] arr = new int[m + n];
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
        for (int i = n; i < m + n; i++) {
            arr[i] = arr2[i - n];
        }
        for(int i=0;i<m+n-1;i++){
            for(int j=i+1;j<m+n;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        System.out.println("\nThe union of the given arrays is : ");
        for(int i=0;i<m+n;i++){
            if(arr[i]!=-1){
                System.out.print("\t"+arr[i]);
            }
        }
        sc.close();
        System.out.println("SpiC AD :)");
    }
}