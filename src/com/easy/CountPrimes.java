package com.easy;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
//        if(n<=1)
//            return 0;
//
//        for(int i =2; i<n; i++){
//            if(n%i == 0){
//                ;
//            }
//            count+=i;
//        }
//        return count;

        boolean prime[] = new boolean[n];
        for(int i=0; i<n; i++)
            prime[i] = true;

        for(int i = 2; i<=Math.sqrt(n); i++)
        {

            for(int j = 2; i*j < n; j++)
                prime[i*j] = false;
        }

     for(int i = 2; i <prime.length; i++)
    {
        if(prime[i] == true)
            count++;
    }
        return count;
    }
}