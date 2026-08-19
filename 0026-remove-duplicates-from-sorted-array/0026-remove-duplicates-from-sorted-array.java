class Solution {
    public int removeDuplicates(int[] nums) {
    int k=0,len=nums.length;
    for(int i=1;i<len;i++)
    if(nums[k]!=nums[i])
    nums[++k]=nums[i];
    return k+1; 
    }
}