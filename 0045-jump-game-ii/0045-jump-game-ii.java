class Solution {
    public int jump(int[] nums) {
         int index=0,greatestIndex=0,checkedIndex=0,step=0;
   while(index<nums.length){
    if(index+nums[index]>=nums.length-1)
        return ++step;
    greatestIndex=index+nums[index];
    for(int j=index+nums[index]-1;j>checkedIndex;j--){
        if((j+nums[j])>greatestIndex+nums[greatestIndex])
            greatestIndex=j;
       // System.out.println(j);
         }
         System.out.println(greatestIndex);
         checkedIndex=index+nums[index];
         index=greatestIndex;
         step++;

   }
   return step;
    }
}