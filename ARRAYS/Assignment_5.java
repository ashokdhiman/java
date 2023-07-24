import java.util.Scanner;

public class Assignment_5 {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    /*
     * Q1. Given an integer m, n, and n integers, return true if the number of
     * unique integers among the n integers is
     * greater than or equal to m, else return false.(Integers appearing multiple
     * times are all considered as 1 unique
     * integer)
     * Input:
     * 5
     * 10
     * 1 2 1 4 5 2 1 1 2 2
     * Expected Output:
     * false
     */
    static boolean unique(int[] arr, int m, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                count++;
            }
        }
        if (count >= m) {
            return true;
        }
        return false;
    }
    
    //  Q2.Given an integer array arr, return the number of consecutive
    //  sequences(subarrays) with odd sum.
    //  Input 1:
    //  N = 3
    //  [1,3,5]
    //  Expected Output:
    //  4

    static void subarraysWithOddSum(int[] arr,int n){
        int a=0;
        for(int i=1;i<=n;i++){
            a+=i;
        }
        int tSum=sum(arr);
        int count=0;
        int temp=0;
        int j=0;
        for(int i=0;i<a;i++){
            if(temp==tSum){
                temp-=arr[j];
                tSum-=arr[j];
                j++;
            }
            else{
                 temp+=arr[i];
            }
            if(temp%2!=0){
                count++;
            }
        }
        System.out.println("The no. of subarrays with odd sum are : "+count);
    }
    /*
     * Q3. You are given an integer array height of length n. There are n vertical
     * lines drawn such that the two endpoints
     * of the ith line are (i, 0) and (i, height[i]).
     * Find two lines that together with the x-axis form a container, such that the
     * container contains the most water.
     * Return the maximum amount of water a container can store.
     * Input:
     * n = 9
     * height = [1,8,6,2,5,4,8,3,7]
     * Expected Output:
     * 49
     */

    /*
     * Q4. Given a 1-indexed array of integers numbers that is already sorted in
     * non-decreasing order, find two
     * numbers such that they add up to a specific target number.
     * Return the indices of the two numbers added by one. Return -1 if pair does
     * not exist.
     * Input:
     * n = 4
     * numbers = [2,7,11,15]
     * target = 9
     * Expected Output:
     * 1 2
     */

    /*
     * Q5. Given an array sorted in increasing order, return an array of squares of
     * each number sorted in increasing
     * order
     * Input: 
     * N = 6
     * Arr[] = [-5, -2, -1, 0, 4, 6]
     * Expected Output:
     * [0, 1, 4, 16, 25, 36]
     */
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
        System.out.print("\nEnter m : ");
        int m = sc.nextInt();
        boolean check = unique(arr, m, n);
        System.out.println(check);
        subarraysWithOddSum(arr, n);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
