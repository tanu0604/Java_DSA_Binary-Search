public class SingleElement {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,6,6,7,7};
        int ans=FindSingleElement(arr);
        System.out.println(ans);
    }
    static int FindSingleElement(int[] arr)
    {
                int n= arr.length;
                int start=1;
                int end=n-2;
                //when the length of the array is 1
                if(n==1){
                    return arr[n-1];
                }
                //Checking if the first element is equal to the second element
                if(arr[0]!=arr[1])
                {
                    return arr[0];
                }
                //Checking if the last element is equal to the second last element
                if(arr[n-1]!=arr[n-2])
                {
                    return arr[n-1];
                }
                //Now checking if the single element is present in the middle part of the array
                while(start<=end)
                {
                    int mid=start+(end-start)/2;
                    if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
                    {
                        return arr[mid];
                    }
                    //this line means that the left part of the array has no single element and hence moves it to the right part to check

                    if((mid% 2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1]))
                    {
                        start=mid+1;
                    }
                    // no single element present in the right part hence moves the end to the left part
                    else{
                        end=mid-1;
                    }
                }
                return -1;
    }
}
