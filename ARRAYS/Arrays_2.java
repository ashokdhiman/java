import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2 {
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
    static void occurance(int [] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("\n"+x+" is present "+count+" times in array");
    }
    static void lastOccurance(int[] arr,int x){
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        System.out.println("The last occurance of "+x+" is at index "+index);
    }
    static void IsSorted(int[] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                break;
            }
            else{
                count++;
            }
        }
        if(count==arr.length-1){
            System.out.println("Array is sorted");
        }
        else{
             System.out.println("Array is not sorted");
        }
    }
    static void arrayWithMaxAndMin(int[] arr){
        Arrays.sort(arr);
        int[] arr2=new int[2];
        arr2[0]=arr[0];
        arr2[1]=arr[arr.length-1];
        System.out.print(arr2[0]+" "+arr2[1]);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr, n);
        display(arr);
        occurance(arr, 2);
        lastOccurance(arr, 2);
        sc.close();
        IsSorted(arr);
        arrayWithMaxAndMin(arr);
        System.out.println("SpiC AD :)");
    }
}
