class Solution {
    public int maxArea(int[] height) {
    int n =height.length;
    int left=0,right=n-1;
    int maxWater =0;
    while(left<right)
    {
        int width = right-left;
        int ht=Math.min(height[left],height[right]);
        int area = width*ht;
        maxWater =Math.max(maxWater,area);
        if(height[left]<height[right]) {
            left++;
        } else{
            right--;
        }
    }
    return maxWater;
    }
}