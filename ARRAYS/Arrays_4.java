import java.util.Scanner;

public class Arrays_4 {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }
    static void reverse(int[] arr,int n){
        int temp;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    static void rotate(int[] arr,int n,int k){
        int x=0;
        int temp;
        k=k%n;
        while(x<k){
            temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            x++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        reverse(arr, n);
        display(arr);
        System.out.print("\nEnter k : ");
        int k=sc.nextInt();
        rotate(arr, n, k);
        display(arr);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
