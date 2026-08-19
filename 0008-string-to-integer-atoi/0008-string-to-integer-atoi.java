class Solution {
    public int myAtoi(String s) {
        double a =0;int b=0,c=0,d=0;
        for (int i =0;i<s.length();i++)
        {
    if(s.charAt(i)<58&&s.charAt(i)>47||s.charAt(i)==45||s.charAt(i)==32||s.charAt(i)==43)
            {if ((s.charAt(i)==43||s.charAt(i)==45))
            d++;
            if(d>1)
            break;
            if ((s.charAt(i)==43||s.charAt(i)==45)&&(i+2)<=s.length()){
                  if (s.charAt(i+1)==32)
                  break;}
            
                
                
                if (s.charAt(i)==45&&b==0)
            c++;
            else if ((s.charAt(i)==32||s.charAt(i)==45||s.charAt(i)==43)&&b!=0)
            break;
            else if(s.charAt(i)!=32&&s.charAt(i)!=43)
            {
            a=a*10+(s.charAt(i)-'0');
               b++;} 
            }
        
            else 
            break;

            
        }
        if(c!=0)
        a*=(-1);  
        
        if(a<-2147483648)
        return -2147483648;
        if(a>2147483647)
        return 2147483647;
        else
        return (int)a;
        
    }
}
        
    

        
    

        
    