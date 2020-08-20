package com.medium;

public class ContainerWithMosWater {
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - 1));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}