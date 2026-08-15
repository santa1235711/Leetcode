class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,minusBack=0,sum=0;
     while(left<right){
        int lowerside=Math.min(height[left],height[right]);
        if(lowerside!=0)
     sum+=(lowerside*(right-left-1)-Math.min(minusBack,lowerside)*(right-left));
     minusBack=Math.max(minusBack,lowerside);
     if(height[right]>height[left]){
        left++;
       
     }
     else {
        right--;
       
     }
     }
     return sum;
    }
}