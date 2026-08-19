class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> collect=new ArrayList();
        recursion(collect,"",0,0,n);
        return collect;
        
    }
    public static void recursion(List<String> collect,String buffer,int open,int close,int n)
    {
        if(close==n)
        {
            collect.add(buffer);
            return;
        }
        if (open<n)
        recursion(collect,buffer+'(',open+1,close,n);
        if(close<open)
        recursion(collect,buffer+')',open,close+1,n);
    }
}