import java.util.Scanner;

public class Assignment_4 {
    static void display(int[] arr) {
        System.out.println("\nThe array entered is :-");
        for (int vals : arr) {
            System.out.print("\t" + vals);
        }
    }

    static int firstRepeat(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    static int[] arrange(int[] arr,int n) {
        int[] ans = new int[arr.length];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                count++;
            }
        }
        int k=0;
        int j=0;
        int[] pos=new int[count];
        int[] neg=new int[n-count];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos[j]=arr[i];
                j++;
            }
            else{
                neg[k]=arr[i];
                k++;
            }
        }
        int i=j=k=0;
        while(i<n-count && j<count){
            if(k%2==0){
                ans[k]=neg[i];
                i++;
                k++;
            }
            else{
                ans[k]=pos[j];
                j++;
                k++;
            }
        }
        while(i<n-count){
            ans[k]=neg[i];
            i++;
            k++;
        }
        while(j<count){
            ans[k]=pos[j];
            j++;
            k++;
        }
        return ans;
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
        int x = firstRepeat(arr);
        System.out.println("\nThe first repeating value is at position : " + x);
        int[] ans=arrange(arr,n);
        display(ans);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
