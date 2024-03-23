public class NthRoot {
        public static void main(String[] args) {
            int num=64;
            int root=3;
            int ans=FloorSqrt(num,root);
            System.out.println(ans);
        }
        //Binary search

        static int FloorSqrt(int num,int root)
        {
            int ans=-1;
            int start=0;
            int end=num;
            while (start<=end) {
                double mid = start + (end - start) / 2;
                double val = Math.pow(mid, (double) root);
                if (val > num)
                    end = (int) (mid - 1);
                else {
                    ans = (int) (mid);
                    start = (int) (mid + 1);
                }
            }
            return ans;
        }
    }
