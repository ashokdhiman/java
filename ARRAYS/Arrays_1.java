import java.util.Scanner;

public class Arrays_1 {
    static void input(int [] arr,int n){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    static void display(int[] arr){
        System.out.println("The array entered is :-");
        for (int vals:arr) {
            System.out.print("\t" + vals);
        }
    }
    static void sum_of_all_elements(int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("\nThe sum of elements in arraay is : " + sum);
    }
    static void Max_of_all(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nThe max of all is : " + max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        display(arr);
        sum_of_all_elements(arr, n);
        Max_of_all(arr);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
