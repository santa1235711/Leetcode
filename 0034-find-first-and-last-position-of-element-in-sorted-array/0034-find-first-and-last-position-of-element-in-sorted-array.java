class Solution {
    public int[] searchRange(int[] nums, int target) {
         int left=0,right=nums.length-1;
        int mid;
        while(left<=right){
mid=left+((right-left)>>>1);
            if(nums[mid]==target){
                return get(nums,mid);
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    

    public static int[] get(int[] nums,int point){
      int[] arr={-1,-1};
     int left=0,right=point;
   int mid =0;
     while(left<=right){
         
        mid=left+((right-left)>>1);
       
        if(nums[mid]==nums[point])
        { arr[0]=mid;
            
            right=mid-1;
        }
        else 
        {
           
            left=mid+1;
        }
     }
    
      

      left=point;right=nums.length-1;
     while(left<=right){
         
         
      mid=left+((right-left)>>>1);
      if(nums[mid]==nums[point]){arr[1]=mid;
        left=mid+1;
      }
      else{
      right=mid-1;
          
      }
     }
 return arr;
    }
}