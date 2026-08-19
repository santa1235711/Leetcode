class Solution {
    public int strStr(String haystack, String needle) {
        int haylen=haystack.length(),needlen=needle.length();
        

        
        int pointer=0;
        
while(pointer+needlen<=haylen)
{ 
    
        if(needle.equals(haystack.substring(pointer,(pointer+needlen))))
        return pointer;
        pointer++;
        }
        
        
return -1;
        

}
}
