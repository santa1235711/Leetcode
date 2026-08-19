class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f=0,d=0;
        HashMap<Character,Integer> let= new HashMap<>();
        for( int i=0; i<s.length();i++)
        {
            if(let.containsKey(s.charAt(i))&&d<=let.get(s.charAt(i)))
            { 
                if (f<(i-d))
                f=i-d;
                
                d=let.get(s.charAt(i))+1;
                let.put(s.charAt(i),i);
                
               
                
            }
            else
            let.put(s.charAt(i),i);
        }
     if(f<s.length()-d)
     f=s.length()-d;
     return (f);
    }
}