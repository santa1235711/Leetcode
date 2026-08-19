class Solution {
   
public static int divide(int dividend, int divisor) {
    
    if(mod(dividend)<mod(divisor))
        return 0;
    else if(divisor==1)
        return dividend;
        
    else if (divisor==-1)
    {
        if(dividend==Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        else if(dividend<0)
            return (~dividend+1);
        else
            return (~dividend+1);
    }

   else if (dividend<0){
    if(divisor<0)
    return workneg(dividend,divisor);
    else {
        divisor=~divisor+1;
        return (~workneg(dividend, divisor)+1);}
    }

else
{ if(divisor>0)
    return workpos(dividend,divisor);
    else
    {
        divisor=~divisor+1;
        return (~workpos(dividend, divisor)+1);
    }

}
    


    

        
    }
    public  static int workpos(int dividend ,int divisor)
    {
        int count=0;long i =0;
    
     for ( i=divisor;i<=dividend;i+=divisor) 
        ++count;

      
    
      return count;


    }
    public  static int workneg(int dividend ,int divisor)
    {
        int count=0;long i =0;
    
     for ( i = divisor; i >= dividend; i += divisor)  
      ++count;

      
      return count;


    }
    public static long mod(int x)
    {  
        if (x==Integer.MIN_VALUE)
        return Integer.MAX_VALUE+1L;
        
        else
        return (x ^ (x >> 31)) - (x >> 31);
    }
}