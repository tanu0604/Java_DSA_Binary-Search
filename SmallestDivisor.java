public class SmallestDivisor {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int limit=10;
        int ans=FindDivisor(arr,limit);
        System.out.println(ans);
    }

    //Applying binary search
    static int FindDivisor(int[] arr,int limit)
    {
        int start=0;
        int end=FindMax(arr);
        int mid;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            int div=SmallestDivisor(arr,mid);
            if (div<=limit) {
              int  ans = mid;
              end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    // Finding the minimum divisor which will divide all the elements present int the array

    static int SmallestDivisor(int[] arr,int divisor)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans+=Math.ceil((double) (arr[i])/(double) (divisor));
        }
        return ans;
    }

    //Finding the end value which will be the maximum value in the array
    static  int FindMax(int[] arr)
    {
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
