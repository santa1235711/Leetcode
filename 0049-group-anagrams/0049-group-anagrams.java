class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> outerList=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        int counter=0;
       
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.length;i++){
            int[] frequencyMap=new int[26];
            int len=strs[i].length();
            //System.out.println(strs[i].charAt(len-1));

           for(int j=0;j<len;j++){
            ++frequencyMap[strs[i].charAt(j)-'a'];
        //System.out.println(frequencyMap[strs[i].charAt(j)-'a']);
        }
           

           for(int j=0;j<26;j++)
            sb.append(frequencyMap[j]).append('#');

         String buff=sb.toString();
        // System.out.println(buff);
         sb.setLength(0);
        

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