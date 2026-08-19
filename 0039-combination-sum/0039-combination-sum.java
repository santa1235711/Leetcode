class Solution {
    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outerList= new ArrayList<>();
        List<Integer> innerList=new ArrayList<>();
      // Arrays.sort(candidates);
        for(int i=0;i<candidates.length;i++){
            innerList.add(candidates[i]);
            recursion(candidates,outerList,innerList,i,candidates[i],target);
            innerList.removeLast();

        }
        return outerList;
    }

     public  static void recursion(int[] arr,List<List<Integer>> outerList,List<Integer> innerList,int index, int sum,  int target){

if(sum==target){
    outerList.add(new ArrayList(innerList));
    return;
}
else{
    for(int i=index;i<arr.length;i++){
        if(sum+arr[i]<=target){
            innerList.add(arr[i]);
            recursion(arr,outerList,innerList,i,sum+arr[i],target);
            innerList.removeLast();
        }

    }
}

 }
}