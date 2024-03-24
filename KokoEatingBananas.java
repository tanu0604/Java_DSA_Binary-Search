//https://www.codingninjas.com/studio/problems/minimum-rate-to-eat-bananas_7449064?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int hours=8;
        int ans=FindMinBananas(piles,hours);
        System.out.println(ans);
    }
    //Minimum number of bananas that can be eaten within the number of hours given
    static int FindMinBananas(int[] piles,int hours)
    {
        int low=1;
        int high=Findmax(piles);
        int mid;
        while (low<=high)
        {
            mid=low+(high-low)/2;
           int total=FindTotalHours(piles,mid);
           if(total<=hours)
           {
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        return low;
    }

    //To find the value of the highest element in the piles
    static int Findmax(int [] piles)
    {
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }


    //To find the number of hours taken to eat the bananas
    static int FindTotalHours(int [] piles,int hour)
    {
        int total=0;
        for (int i = 0; i < piles.length; i++) {
            total+=Math.ceil((double) (piles[i])/(double) (hour));
        }
        return total;
    }
}
