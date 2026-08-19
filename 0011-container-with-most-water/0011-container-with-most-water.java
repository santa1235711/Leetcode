class Solution {
    public int maxArea(int[] height) {
        int a =0,b=height.length-1,c=0,d=0;
        while (a<b)
        {
         if (height[a]>height[b])
         {  d=height[b];c=(c<d*(b-a))?d*(b-a):c;b--;
          
         }
         else {
             d=height[a];c=(c<d*(b-a))?d*(b-a):c;a++;
         }
          
         
        }
        return c;
    }
}