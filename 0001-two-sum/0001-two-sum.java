class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
       
    int i, r=0;
    
    for( i=0; i<nums.length-1;i++)
    {
        
         r=i; int a=0;
        while(r<nums.length-1)
        {
            r++;
            a=nums[i]+nums[r];
            if(a==target)
            break;
          
           
        }
    if(a==target)
    break;
    

    }
    
    int[] aww= new int[2];
    
    
    aww[0]=i;
    aww[1]=r;
    return (aww);
    }
}
    
    