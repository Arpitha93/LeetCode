package com.easy;

import java.io.Reader;

public class ReadNChar extends Reader4
{
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int count = 0;
        int bCapacity = read4(buffer);
        while(bCapacity > 0){
            for(int i=0; i<bCapacity; i++){
                if(n == count)
                    break;
                buf[count++] = buffer[i];
            }
            bCapacity = read4(buffer);
        }
        return count;
    }
}