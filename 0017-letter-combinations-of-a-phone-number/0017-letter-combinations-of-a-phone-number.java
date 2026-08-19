class Solution {
    public List<String> letterCombinations(String digits) {
       
        List<String> collect=new ArrayList<String>();
        String buffer="";int lendigit=digits.length(),j=0;
        char[][] letarr={{},{},{'a','b','c',' '},{'d','e','f',' '},
        {'g','h','i',' '},{'j','k','l',' '},{'m','n','o',' '},
        {'p','q','r','s',' '},{'t','u','v',' '},
        {'w','x','y','z',' '}};
        char[][] store=new char[lendigit][];
        for (int i=0;i<lendigit;i++)
        {
            int z=digits.charAt(i)-48;
            
          store[i]=letarr[z];
            
        }
        
         recursion(collect,store,buffer,lendigit,j);
         return collect;
        
    }
     public static void recursion(List<String> collect,char[][] store,String buffer,int lendigit,int j)
    {
        
        if(j==lendigit){
        collect.add(buffer);
    return;
}
        else{int i=0;
        while(store[j][i]!=' ')
        {
            recursion(collect,store,buffer+store[j][i],lendigit,j+1);
            i++;
        }}
    }
}