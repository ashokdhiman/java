import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        //declaration 
        ArrayList<Integer> l1=new ArrayList<>();
        
        // adding new elements
        System.out.print("Enter number of elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        for(int i=1;i<=n;i++){
            System.out.print("Enter element : ");
            temp=sc.nextInt();
            l1.add(temp);
        }

        //display of arraylist
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //get an element at index i
        System.out.print("\nEnter index : ");
        int index=sc.nextInt();
        System.out.println(l1.get(index));
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //add element at index 
        System.out.print("\nEnter value : ");
        int val=sc.nextInt();
        l1.add(index,val);
        System.out.println("\nThe elements are :");
        System.out.println(l1);
        l1.add(index+1,val+1);
        System.out.println("\nThe elements are :");
        System.out.println(l1);
        
        //modifying element at index with its square
        l1.set(index,val*val);
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //removing an element at index 
        l1.remove(index);
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //removing element directly
        l1.remove(Integer.valueOf(val+1));
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //checking if an element exists
        System.out.println(l1.contains(Integer.valueOf(6)));

        //if we don't specify class we can put anything inside it

        // reversing the arraylist
        Collections.reverse(l1);
        System.out.println("\nThe elements are :");
        System.out.println(l1);

        //sorting arraylist
        Collections.sort(l1);
        System.out.println("\nThe elements in ascending order are :");
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("\nThe elements in descending order are :");
        System.out.println(l1);

        sc.close();
        System.out.println("SpiC AD :)");
    }
}
