class Solution {
    public String convert(String s, int numRows) {
      String store="";int a=0,b=2,l=s.length();
     if(numRows>=l||numRows==1)
     store=s;
     
     
     else{
      while(a<l)
      {
        store+=s.charAt(a);
        a+=(numRows*2)-2;
      }
      for (int i=1;i<(numRows-1);i++)
      {
        a=i+(numRows*2)-2;
        store+=s.charAt(i);
        while(a<l)
        {
            store+=s.charAt(a-b);
            store+=s.charAt(a);
            a+=(numRows*2)-2;
        }

        if(a>=l&&(a-b)<l)
        store+=s.charAt(a-b);


        b+=2;
      }
      a=numRows-1;
      while(a<l)
      {
        store+=s.charAt(a);
        a+=(numRows*2)-2;
      }}
      return store ;
    }
}