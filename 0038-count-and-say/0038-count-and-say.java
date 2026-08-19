class Solution {
    public  String countAndSay(int n){
        StringBuilder ss=new StringBuilder("1");
     for(int i=2;i<=n;i++){
         ss=getString(ss);
     }
     return ss.toString();
        
     
    }
    public static StringBuilder getString(StringBuilder buff){
        StringBuilder sb=new StringBuilder();
        int length=buff.length();
        int same =1;int i=1;
        for( i=1;i<length;i++){
            if(buff.charAt(i)==buff.charAt(i-1))
                same++;
            else
            {
                sb.append(same).append(buff.charAt(i-1));
                same=1;

            }
        }
        sb.append(same).append(buff.charAt(i-1));
        return sb;
    }
}