import java.util.Scanner;

public class TargetSum{
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
    static void targetSum(int[] arr,int n,int x){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                        count++;
                    }
            }
        }
        System.out.println("\nTotel no. of pairs are : "+count);
    }
    static void targetSum2(int[] arr,int n,int x){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.print("("+arr[i]+","+arr[j]+")\t");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n);
        display(arr,n);
        targetSum(arr,n,7);
        targetSum2(arr,n,7);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}