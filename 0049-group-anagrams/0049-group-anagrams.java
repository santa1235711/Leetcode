class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> outerList=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArray=strs[i].toCharArray();
            Arrays.sort(charArray);
            String buff=new String(charArray);
            if(map.containsKey(buff)){
             map.get(buff).add(strs[i]);
            }
            else{
                map.put(buff,new ArrayList<>(List.of(strs[i])));
            }
        }

        for(String key:map.keySet()){
            outerList.add(map.get(key));
        }
return outerList;   
    }
}