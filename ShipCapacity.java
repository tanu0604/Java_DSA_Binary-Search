public class ShipCapacity {
    public static void main(String[] args) {
        int [] weight={1,2,3,4,5,6,7,8,9,10};
        int days=1;
        int ans=FindMinCapacity(weight,days);
        System.out.println(ans);
    }
    static int FindMinCapacity(int[]weight,int days)
    {
        int start=FindMax(weight);
        int end=FindSum(weight);
        int mid;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            int daysReq=FindDays(weight,mid);
            if(daysReq<=days)
              end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }
    //Finding the minimum number of days required
    static int FindDays(int[] weight,int cap)
    {
        int dayss=1;
        int load=0;
        for (int i=0;i<weight.length;i++)
        {
            if(load+weight[i]>cap)
            {
                dayss++;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return dayss;
    }
    //Finding the maximum weight of the package to start the search
    static  int FindMax(int[] weight)
    {
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < weight.length; i++) {
            maxi=Math.max(maxi,weight[i]);
        }
        return maxi;
    }

    //The summation of the array will be the max capacity required

    static int FindSum(int[] weight)
    {
        int sum=0;
        for (int i = 0; i < weight.length; i++) {
            sum+=weight[i];
        }
        return sum;
    }

}
