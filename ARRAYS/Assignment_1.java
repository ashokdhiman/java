import java.util.Scanner;

public class Assignment_1 {
    static void input(int [] arr,int n){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    static void display(int[] arr,int n){
        System.out.println("The array entered is :-");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
    static void min_of_all(int[] arr,int n){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nThe minimum element is : "+min);
    }
    static void peak(int[] arr,int n){
        int peak=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]){
                if(arr[i]>arr[i+1]){
                    if(arr[i]>peak){
                        peak=arr[i];
                    }
                }
            }
        }
        System.out.println("\nPeak element is : "+peak);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        display(arr, n);
        min_of_all(arr, n);
        peak(arr, n);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}