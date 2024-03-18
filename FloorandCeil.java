import java.util.Arrays;

public class FloorandCeil {
    public static void main(String[] args) {
        int[] a = {3, 4, 4, 7, 8, 10};
        int target = 8;
        int n = a.length;
        int floor = FindFloor(a, n, target);
        int ceil=FindCeil(a,n,target);
        System.out.println(floor);
        System.out.println(ceil);
    }

    static int FindFloor(int[] arr, int n, int x) {
        int start = 0, end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    static int FindCeil(int[] arr, int n, int x) {
        int start = 0, end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];

                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
