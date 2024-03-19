import java.util.ArrayList;

public class CountEle {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3};
        int k=3;
        int count=0;
        int n= arr.length;
        int first=FirstOccurance(arr,n,k);
        if(first==-1)
            count=0;
        else{
            int last=LastOccurance(arr,n,k);
            count=(last+1)-first;
        }
        System.out.println(count);
    }
    static int FirstOccurance(int[] arr, int n, int k)
    {
        int low=0;
        int high=n-1;
        int mid;
        int first=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==k)
            {
                //since we are finding the last occurance the can be elements in the left side equal to k so here we are doing high=mid-1

                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    //finding the last occurance
    static int LastOccurance(int[] arr,int n,int k)
    {
        int low=0;
        int high=n-1;
        int mid;
        int last=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==k)
            {
                //since we are finding the last occurance the can be elements in the right side equal to k so here we are doing low=mid+1
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
