public class lowerBound {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,7,8,9,9,9,11};
        int x=9;
        int n= arr.length;
        System.out.println(lower(arr,n,x));
    }
    static int lower(int[] arr,int n,int x){
        int start=0;
        int end=n-1;
        int mid;
        int ans=n;
        while (start<=end)
        {
            mid=start+(end)-start/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return ans;
    }
}
