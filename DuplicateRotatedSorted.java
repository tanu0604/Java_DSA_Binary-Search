import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class DuplicateRotatedSorted {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int n = nums.length;
        int target = 0;
        boolean ans = FindIndex(nums, n, target);
        System.out.println(ans);
    }

    static boolean FindIndex(int []nums, int n, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start]==nums[mid]&& nums[mid]==nums[end])
            {
                start++;
                end--;
                continue;
            }
             if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && nums[mid]>=target)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && nums[end]>=target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
