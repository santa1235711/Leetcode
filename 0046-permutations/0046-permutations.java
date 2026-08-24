class Solution {

public static int len;
    public static void recursion(List<List<Integer>> outerList,List<Integer> innerList,int ptr,int counter){
      
         if(counter==len){
            
            return;
        }
        if(ptr==len-1){
           outerList.add(new ArrayList<>(innerList));
           return;
        }
        else{
             int x=innerList.get(ptr);
             innerList.set(ptr,innerList.get(counter));
             innerList.set(counter,x);
                recursion( outerList, innerList, ptr+1,ptr+1);
              x=innerList.get(ptr);
             innerList.set(ptr,innerList.get(counter));
             innerList.set(counter,x);
             

        }
           recursion(outerList, innerList, ptr, counter+1);
    }
    public List<List<Integer>> permute(int[] nums) {
         len=nums.length;
    List<List<Integer>> outerList=new ArrayList<>();
    List<Integer> innerList=new ArrayList<>();
    for(int a:nums)
        innerList.add(a);
    recursion(outerList, innerList, 0,0);
    return outerList;
    }
}