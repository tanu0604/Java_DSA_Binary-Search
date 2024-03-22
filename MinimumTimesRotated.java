public class MinimumTimesRotated {
    public static void main(String[] args) {
        int [] a={7,8,9,10,1,2,3,4,5,6};
        int ans=MinTimeRotated(a);
        System.out.println(ans);
    }
    static int MinTimeRotated(int []a)
    {
        int n=a.length;
        int start=0;
        int end=n-1;
        int mid,index=-1;
        int ans=Integer.MAX_VALUE;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if(a[start]<=a[end])
            {
                if(a[start]<=ans) {
                    index = start;
                    ans=a[start];
                }
                break;
            }
            //if the left part is sorted
            if(a[start]<=a[mid])
            {
              if(a[start]<ans) {
                  index = start;
                  ans=a[start];
              }
                start = mid + 1;
            }
            // if the right part is sorted
            else
            {
               if(a[mid]<=ans) {
                   index = mid;
                   ans=a[mid];
               }
                end = mid - 1;
            }
        }
        return index;
    }
}
