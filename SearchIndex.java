public class SearchIndex {
    public static void main(String[] args) {
        int arr[] = {3,5,9,21,35};
        int x = 8;
        int n = arr.length;
        System.out.println(search(arr, n, x));
    }
    static int  search(int []arr,int n,int m)
    {
        int start=0;
        int end=n-1;
        int mid;
        int ans=n;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>m)
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
