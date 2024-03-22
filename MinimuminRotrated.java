public class MinimuminRotrated {
    public static void main(String[] args) {
        int[] a={7,8,2,3,4,5,6};
        int ans=FindMinimum(a);
        System.out.println(ans);
    }
    static int FindMinimum(int[] a)
    {
        int n=a.length;
        int start=0;
        int end=n-1;
        int mid;
        int ans=Integer.MAX_VALUE;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            //if the left part is sorted
            if(a[start]<=a[mid])
            {
                ans=Math.min(ans,a[start]);
                start=mid+1;
            }
            // if the right part is sorted
           else
            {
                ans=Math.min(ans,a[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}
