class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         int[] compareMap;
      List<String> innerList;
      List<List<String>> outerList=new ArrayList<>();
      int lenPerString=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i]==null)
                continue;

           compareMap =new int[26];
           innerList=new ArrayList<>();
         for(int j=0;j<strs[i].length();j++){
            System.out.println(strs[i].charAt(j)-'a');
            compareMap[strs[i].charAt(j)-'a']++;
         }
         innerList.add(strs[i]);
         for(int m=i+1;m<strs.length;m++){
            if(strs[m]==null||strs[m].length()!=strs[i].length())
            continue;

            int n;
            int[]  storeMap=new int[26];
            for(n=0;n<strs[m].length();n++){
                int storeCharacter=strs[m].charAt(n)-'a';
                if(compareMap[storeCharacter]==storeMap[storeCharacter])
                   break;
                else 
                   storeMap[storeCharacter]++; 
            }
            if(n==strs[m].length()){
                innerList.add(strs[m]);
            strs[m]=null;
            }
         }
         outerList.add(new ArrayList<>(innerList));


         
        }
        return outerList;
    }
}