class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
List<List<Integer>> outerlist =new ArrayList<>() ;
List<Integer> innerlist=new ArrayList<>();int xfactor=0;

Arrays.sort(nums); int l=nums.length-1;int a=nums[0],b=nums[l];
if(a>=0&&b>0)
return outerlist;
else if(a<0&&b<=0)
return outerlist; 
else if(a==0&&b==0)
{
innerlist.add(0);
innerlist.add(0);
innerlist.add(0);
outerlist.add(innerlist);
return outerlist;

}
else{
for (int i=1;i<l;i++)
{ int store=nums[i];int neg=nums[i-1];
    if(store<0&&store==nums[i+1])
    continue;
    else if(store>0&&store==neg)
    continue;
    else if (store==0&&store==neg)
    continue;
    else 
    { 
        
        
       int  left =0,right=l;
        while(left<i&&right>i)
        {
             a=nums[left];b=nums[right];int san1=nums[left+1],san2=nums[right-1];
        if(store!=san1&&a==san1)
    left++;
    else if(store!=san2&&b==san2)
    right--;
       else if ((store+a+b)>0)
        right--;
        else if ((store+a+b)<0)
        left++;
        else 
        {innerlist=new ArrayList<>();
            innerlist.add(a);
        innerlist.add(store);
        innerlist.add(b);
        outerlist.add(innerlist);
        left++;right--;

        }
        }
        

    }if(store==0)
    xfactor=i;
}
if((l-1-xfactor)>2&&(nums[xfactor]+nums[xfactor+1]+nums[xfactor+2]==0))
{innerlist=new ArrayList<>();
            innerlist.add(0);
        innerlist.add(0);
        innerlist.add(0);
        outerlist.add(innerlist);

}
        
  return outerlist; } }
}