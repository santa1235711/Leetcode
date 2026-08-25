class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=nums[0];int ptr=1;
        while(ptr<nums.length){
            //System.out.println(" i = "+i+" ptr = "+ptr);
         if((i-1)>=nums.length||(i-1)<0){
           // System.out.println("1 entered");
         
         i=nums[ptr];
         ptr++;
        // System.out.println("1 if done");
         }
         
         else if(nums[i-1]==i){
                        //System.out.println("2 entered");
                       //  System.out.println (Arrays.toString(nums));

         i=nums[ptr];
         ptr++;
         //System.out.println("2 if done");
         }
         
         else{
       // System.out.println("3 entered");
                      

            int x=nums[i-1];
            nums[i-1]=i;
            i=x;
           // System.out.println("3 if done");
         }

        } 
        if(i-1>-1&&i-1<nums.length){
            nums[i-1]=i;
        }
        
        //System.out.println("broken");
       // System.out.println(i);
        // System.out.println (Arrays.toString(nums));
        for( i=0;i<nums.length;i++)
        if(nums[i]!=i+1)
        return i+1;

        return nums.length+1;
    }
}