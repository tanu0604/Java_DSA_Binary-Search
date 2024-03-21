//https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public static void main(String[] args) {
        int [] nums={3,5,3,2,0};
        int ans=Peak(nums);
        System.out.println(ans);
    }
    static int Peak(int[] nums)
    {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int mid;
        if(n==1)
            return 0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            if (nums[start]==nums[end])
                return start;
            }
        return -1;
    }
}
