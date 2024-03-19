import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLastOccurance {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 8, 8, 11, 13));
        int k = 8; // Number to find
        int n = arr.size();

        // Call the method to find first and last occurrences
        int[] ans = firstAndLastPosition(arr, n, k);

        // Print the results
        System.out.println("First occurrence: " + ans[0]);
        System.out.println("Last occurrence: " + ans[1]);
    }

     static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first=FirstOccurance(arr,n,k);
        if(first==-1)
        {
            return new int []{-1,-1};
        }
        int last=LastOccurance(arr,n,k);
        return new int[]{first,last};
    }
     static int FirstOccurance(ArrayList<Integer> arr,int n,int k)
    {
        int low=0;
        int high=n-1;
        int mid;
        int first=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr.get(mid)==k)
            {
                //since we are finding the last occurance the can be elements in the left side equal to k so here we are doing high=mid-1

                first=mid;
                high=mid-1;
            }
            else if(arr.get(mid)<k)
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
     static int LastOccurance(ArrayList<Integer> arr,int n,int k)
    {
        int low=0;
        int high=n-1;
        int mid;
        int last=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr.get(mid)==k)
            {
                //since we are finding the last occurance the can be elements in the right side equal to k so here we are doing low=mid+1
                last=mid;
                low=mid+1;
            }
            else if(arr.get(mid)<k)
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

