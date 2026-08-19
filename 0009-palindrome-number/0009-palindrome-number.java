class Solution {
    public boolean isPalindrome(int x) {
      String s =Integer.toString(x) ;
      if (s.length()%2==0)
      {int a=s.length()/2;
      int b =s.length()/2-1;
      while (b>=0&&s.charAt(a)==s.charAt(b))
      {
        ++a;--b;
      }
if (b==-1)
return true ;
else 
return false;
      } 
      else {
        int a =s.length()/2;
        int b =s.length()/2;
        while (b>=0&&s.charAt(a)==s.charAt(b))
        {
            ++a;--b;
        }
        if(b==-1)
        return true;
        else 
        return false;
      }
        
    }
}