public class SquareRoot {
    public static void main(String[] args) {
        int num=;
        int ans=FloorSqrt(num);
        System.out.println(ans);
    }
    //Linear Search
//    static int FloorSqrt(int num)
//    {
//        int ans=0;
//        for (int i = 0; i < num; i++) {
//            int square=i*i;
//            if(square<=num)
//                ans=i;
//            else
//                break;
//        }
//        return ans;
//    }

    //Binary search

    static int FloorSqrt(int num)
    {
        int ans=0;
        int start=0;
        int end=num;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            int square=mid*mid;
            if(square <=num)
            {
                ans=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return ans;
    }
}
