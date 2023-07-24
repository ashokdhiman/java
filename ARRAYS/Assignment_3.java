import java.util.Scanner;
import java.util.Arrays;

public class Assignment_3 {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }

    static boolean Is_absolute_difference_x(int[] arr, int x) {
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] - arr[j] == x) || (arr[i] - arr[j] == -x)) {
                    check = true;
                }
            }
        }
        return check;
    }
    static void occurance(int[] arr,int a){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        System.out.println(count);
    }
    static int missing_integer(int [] arr){
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==count){
                count++;
            }
            else{
                return count;
            }
        }
        return 0;
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
        Arrays.sort(arr);
        System.out.print("\nEnter the integer x : ");
        int x = sc.nextInt();
        System.out.println(Is_absolute_difference_x(arr, x));
        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        occurance(arr, a);
        int[] arr2={1,2,3,5,6,7,8,9,10};
        System.out.println(missing_integer(arr2));
        sc.close();
        System.out.println("SpiC AD :)");
    }
}