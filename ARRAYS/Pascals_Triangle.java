import java.util.Scanner;

public class Pascals_Triangle {
    static void display(int[][] arr) {
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void usingArrays(int n){
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        display(ans);
    }

    static void usingLoops(int n){
        System.out.println();
        int c=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 || i==0){
                    c=1;
                }
                else{
                    c=c*(i-j+1)/j;
                }
                if(c<10){
                    System.out.print(c+"      ");
                }
                else{
                    System.out.print(c+"     ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        usingArrays(n);
        usingLoops(n);
        sc.close();
        System.out.println("SpiC AD :)");
    }
}
