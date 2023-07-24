import java.util.Scanner;

public class Arrays_manipulation {
    static void unique(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        System.out.println("\nThe unique elements are : ");
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                System.out.print("\t"+arr[i]);
            }
        }
    }
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
    static int firstRepeating(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int x=arr[i];
            for(int j=i+1;j<n;j++){
                if(x==arr[j]){
                    return i+1;
                }
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n);
        display(arr,n);
        int x=firstRepeating(arr, n);
        System.out.println("\nThe first repeating no. is : "+arr[x]);
        unique(arr, n);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}