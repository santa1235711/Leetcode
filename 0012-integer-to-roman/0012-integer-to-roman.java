class Solution {
    public String intToRoman(int num) {
        String s="";
        if(num>=3000)
        {
            s=s+"MMM";
            num-=3000;
        }
        else if (num>=2000)
        {
            s=s+"MM";
            num-=2000;
        }
        else if (num>=1000)
        {
            s=s+'M';
            num-=1000;
        }
        if (num>=900)
        {
            s=s+"CM";
            num-=900;
        }
        else if (num>=500)
        {
            s=s+'D';
            num-=500;
        }
        else if(num>=400)
        {
            s=s+"CD";
            num-=400;
        }
        if (num>=300)
        {
            s=s+"CCC";
            num-=300;
        }
        else if (num>=200)
        {
            s=s+"CC";
            num-=200;
        }
        else if (num>=100)
        {
            s=s+'C';
            num-=100;
        }
        if (num>=90)
        {
            s=s+"XC";
            num-=90;
        }
        else if (num>=50)
        {
            s=s+'L';
            num-=50;
        }
        else if(num>=40)
        {
            s=s+"XL";
            num-=40;
        }
        if (num>=30)
        {
            s=s+"XXX";
            num-=30;
        }
        else if (num>=20)
        {
            s=s+"XX";
            num-=20;
        }
        else if (num>=10)
        {
            s=s+'X';
            num-=10;
        }
        if (num==9)
        s=s+"IX";
        else if (num>=5)
        {
            s=s+'V';
            num-=5;
        }
        else if(num==4)
        s=s+"IV";
        if (num==3)
        s=s+"III";
        else if (num==2)
        s=s+"II";
        else if (num==1)
        s=s+'I';


        return s;
    
        


    }
}