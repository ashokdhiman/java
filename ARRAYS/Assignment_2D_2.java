import java.util.Scanner;

public class Assignment_2D_2 {
    static void transpose(int[][] arr,int r,int c){
        int temp;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static void diagonalTraversal(int[][] arr,int r,int c){
        int[] ans=new int[r*c];
        int idx=0;
        int row=0;
        int col=0;
        while(col<c){
            int i=row;
            int j=col;
            while(i>=0 && j<c){
                ans[idx]=arr[i][j];
                idx++;
                i--;
                j++;
            }
            row++;
            if(row>=r){
                row=r-1;
                col++;
            }
        }
        for(int i=0;i<r*c;i++){
            System.out.print(ans[i]+"\t");
        }
        System.out.println();
    }

    static boolean IsTreoplitz(int[][] arr,int r,int c){
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    System.out.println(i+","+j);
                    return false;
                } 
            }
        }
        return true;
    }
    static void reverseColumn(int[][] arr,int r,int c){
        int temp;
        for(int j=0;j<c;j++){
            int st=0;
            int end=r-1;
            while(st<end){
                temp=arr[st][j];
                arr[st][j]=arr[end][j];
                arr[end][j]=temp;
                st++;
                end--;
            }
        }
    }
    static void display(int[][] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void rotation(int[][] arr,int r,int c){
        if(r!=c){
            System.out.println("Not a square matrix");
            return;
        }
        transpose(arr, r, c);
        reverseColumn(arr, r, c);
        display(arr);
    }
    public static void main(String[] args) {
        System.out.print("Enter row :");
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        System.out.print("Enter column :");
        int c=a.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=a.nextInt();
            }
        }
        display(arr);
        //rotation of square matrix in anti clockwise direction
        rotation(arr, r, c);
        //treoplitz matrix or not
        boolean check=IsTreoplitz(arr, r, c);
        System.out.println(check);
        //Diagonaltraversal
        diagonalTraversal(arr, r, c);
        a.close();
        System.out.println("SpiC AD :)");
    }
}
