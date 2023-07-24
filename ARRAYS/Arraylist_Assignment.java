import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Assignment {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print(vals + "\t");
        }
    }

    static void swap(ArrayList<Integer>l1,int a,int b){
        Integer temp = Integer.valueOf(l1.get(a));
        l1.set(a, l1.get(b));
        l1.set(b, temp);
    }

    static ArrayList<Integer> positive(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(arr[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NA");
        } else {
            System.out.println("\nThe positive numbers are : \n"+ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        // declaration
        ArrayList<Integer> l1 = new ArrayList<>();

        // adding new elements
        System.out.print("Enter number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ip;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element : ");
            ip = sc.nextInt();
            l1.add(ip);
        }

        // display of arraylist
        System.out.println("\nThe elements are :");
        System.out.println(l1);
        /*
         * Q->1: Write a Java program to swap two elements in an array list of size n.
         */
        System.out.println("Enter indices of the number you want to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(l1, a, b);
        System.out.println(l1);
        /*
         * Q->2: Given an array of integers, print an arraylist containing only all
         * positive integers present in
         * the array.If no positive integers found, print “NA”.
         */
        System.out.print("Enter the size of array : ");
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        positive(arr);
        sc.close();
        System.out.println("\nSpiC AD :)");
    }
}