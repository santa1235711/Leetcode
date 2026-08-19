class Solution {
    public int romanToInt(String s) {
        int l=s.length()-1;
        int num=0; int a=0,b=0;
        while(l>-1)
        {     
            char  c= s.charAt(l);
            if (c=='I'){
            num+=1; a=1;}
            else if (c=='V'){
            num+=5; a=5;}
            else if (c=='X'){
            num+=10; a=10;}
            else if(c=='L'){
            num+=50; a=50;}
            else if (c=='C'){
            num+=100; a=100;}
            else if (c=='D'){
            num+=500;a=500;}
            else {
            num+=1000;a=1000;}

           if (a<b)
            {
                int sum=a+b;
                if(sum==6)
                num-=2;
                else if(sum==11)
                num-=2;
                else if (sum==60)
                num-=20;
                else if (sum==110)
                num-=20;
                else if (sum==600)
                num-=200;
                else if (sum==1100)
                num-=200;
            }
           b=a;
           l--;
        }
        return num;
    }
}