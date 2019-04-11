package com.easy;

public class LongestCommonPrefix {

    public int findMin(String[] strs, int n){
         int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++)
        {
            if(strs[i].length() < min)
                min = strs[i].length();
        }
        return min;
    }

        public String longestCommonPrefix(String[] strs, int n) {

//            int min = Integer.MAX_VALUE;
//            for(int i=0; i<n-1; i++)
//            {
//                if(strs[i].length() < min)
//                    min = strs[i].length();
//            }
//            return min;

//         String myPrefix = "";
//         int low = 0; high = min;
//         int start, end;
//         String str;

//         while(low <= high){
//            int mid = (low + high)/2;
//             for (int i = 0; i <= (n - 1); i++)
//             {
//                String strs_i = strs[i];

//             for (int j = start; j <= end; j++)
//                 if (strs_i.charAt(j) != str.charAt(j))
//                     return false;
//         }
//         return true;

//             if(myPrefix )
//             myPrefix = myPrefix + strs[0].substring(low,
//                                           mid + 1);
//             low = mid+1;
//             else
//                 high = mid -1;
//         }
//         return myPrefix;


            StringBuilder sb = new StringBuilder();
            int min = findMin(strs, n);
            for(int i=0; i<min; i++){
                for(int j=0; j<strs.length-1; j++){
                    if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                        if(sb.length()==0)
                            return "";
                        else
                            return sb.toString();
                    }
                }

                sb.append(strs[0].charAt(i));
            }
            return sb.toString();
        }
    }

