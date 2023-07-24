import java.util.Scanner;

public class Frequency_Array {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }
    static int[] makeFreqArr(int[] arr){
        int[] freq=new int[100000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the element : ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        int[] freq=makeFreqArr(arr);
        System.out.print("\nEnter number of queries you want to ask : ");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.print("\nEnter number to be searched : ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("\nYES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
