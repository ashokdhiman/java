public class Two_pointers {
    static void display(int[] arr, int n) {
        System.out.println("\nThe array entered is :-");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] aray = { 1, 0, 0, 1, 0, 1, 1, 0 };
        int left = 0;
        int right = aray.length - 1;
        int temp;
        while (left < right) {
            if (aray[left] == 1 && aray[right] == 0) {
                temp = aray[left];
                aray[left] = aray[right];
                aray[right] = temp;
                left++;
                right--;
            } else if (aray[left] == 0) {
                left++;
            } else if (aray[right] == 1) {
                right--;
            }
        }
        display(aray, aray.length);
        int[] arr = { -10, -3, -2, 1, 4, 5 };
        left = 0;
        right = arr.length - 1;
        int[] ans = new int[arr.length];
        int i = arr.length - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[i] = arr[left] * arr[left];
                i--;
                left++;
            } else {
                ans[i] = arr[right] * arr[right];
                i--;
                right--;
            }
        }
        display(ans, arr.length);
        System.out.println("SpiC AD :)");
    }
}
