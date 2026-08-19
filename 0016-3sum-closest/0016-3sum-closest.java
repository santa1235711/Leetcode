class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length;
        int sum=nums[0]+nums[1]+nums[len-1];

        for(int i=0;i<len-2;i++)
        {
            int left=i+1,right=len-1,temp=nums[i]+nums[left]+nums[right];
            while(left<right)
            {   temp=nums[i]+nums[left]+nums[right];
                if(temp>target)
                right--;
                else if(temp<target)
                left++;
                else 
                return target;
                if(Math.abs(target-sum)>Math.abs(target-temp))
                sum=temp;
            }
            
        }
        return sum;
        
    }
}