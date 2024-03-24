public class RoseGarden {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,13,12,11,7};
        int k=3,m=2;
        int ans=roseGarden(arr,k,m);
        System.out.println(ans);
    }
    static int roseGarden(int [] arr,int k,int m)
    {
        int n= arr.length;
        int start=Findmin(arr);
        int end=Findmax(arr);
        int mid;
        if(n<m*k)
        {
            return -1;
        }
        while (start<=end)
        {
            mid=start+(end-start)/2;
            boolean TotalBouquet=FindMinBouquet(arr,mid,k,m);
            if(TotalBouquet==true){
                int ans =mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    //Finding the minimum number of days required to bloom the flower in order to make the bouquet


    static boolean FindMinBouquet(int[] arr,int days,int k,int m)
    {
        int count=0,TotalBouquet=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=days)
            {
                count+=1;
            }
            else {
                TotalBouquet += Math.floor((double) count / (double) (k));
                count = 0;
            }
        }
        TotalBouquet+=Math.floor((double) count/(double) (k));
        if(TotalBouquet>=m)
            return true;
        else
        return false;
    }
    //finding the maximum or ending position in the array
    static int Findmax(int [] arr)
    {
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }


    //finding the minimum or starting position in the array
    static int Findmin(int [] piles)
    {
        int mini=Integer.MAX_VALUE;
        for (int i = 0; i < piles.length; i++) {
            mini=Math.min(mini,piles[i]);
        }
        return mini;
    }
}
