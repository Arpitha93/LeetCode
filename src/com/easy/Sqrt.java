package com.easy;

public class Sqrt {
        public int mySqrt(int x) {

            if(x==0 || x==1){
                return x;
            }

//         int ans = 1, i=0;

//        while(ans <= x){

//            i++;
//            ans = i*i;
//        }
//         return i - 1 ;



            int low = 1, high = x, ans = 0;


            while(low <= high){
                int mid = low+(high + low)/2;

//                if(mid*mid == x)
//                    return mid;

                if(mid <= x/mid){
                    low = mid + 1;
                    ans = mid;
                }
                else
                    high = mid - 1;
            }
            return ans;


        }
}
