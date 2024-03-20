//https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries

import java.util.ArrayList;
import java.util.Arrays;

public class RotatedSorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8));
        int n = arr.size();
        int k = 1;
        int ans = FindIndex(arr, n, k);
        System.out.println(ans);
    }

    static int FindIndex(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            //if the mid element is the target element we can directly return it.
            if (arr.get(mid) == k) {
                return mid;
            }
            //Since it is a rotated sorted array we find whether the left or rigfh part is sorted.
            //First we will see if the left part is sorted
            else if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && arr.get(mid) >= k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            //Now we are checking if the right part is sorted.
            //Either the left or the right part will be sorted since the given array is a rotated array.
            else {
                if (arr.get(mid) <= k && arr.get(high) >= k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
