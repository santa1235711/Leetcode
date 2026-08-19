import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public  List<Integer> findSubstring(String s, String[] words) {
        int sinWordLen = words[0].length();
        int slen = s.length();
        HashMap<String, Integer> compareMap = new HashMap<>();
        HashMap<String, Integer> seenMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            compareMap.put(words[i], compareMap.getOrDefault(words[i], 0) + 1);
        }
        
        for (int i = 0; i < sinWordLen; i++) {
            seenMap = new HashMap<>();
            int count = 0; int x = i;

            for (int j = 0; j < words.length; j++) {
                if (x <= slen - sinWordLen) {
                    String buff = s.substring(x, x + sinWordLen);
                    if (compareMap.containsKey(buff)) {
                        seenMap.put(buff, seenMap.getOrDefault(buff, 0) + 1);
                        if (compareMap.get(buff) >= seenMap.get(buff))
                            count++;
                    }
                    x += sinWordLen;
                }
            }

            if (count == words.length) {
                list.add(i);
            }

            int ptr = i;

            for (int j = x; j <= slen - sinWordLen; j += sinWordLen) {
                String buff = s.substring(ptr, ptr + sinWordLen);
                if (compareMap.containsKey(buff)) {
                    seenMap.put(buff, Math.max(seenMap.getOrDefault(buff, 0) - 1, 0));
                    if (compareMap.get(buff) > seenMap.get(buff))
                        count--;
                }

                buff = s.substring(j, j + sinWordLen);
                if (compareMap.containsKey(buff)) {
                    seenMap.put(buff, seenMap.getOrDefault(buff, 0) + 1);
                    if (compareMap.get(buff) >= seenMap.get(buff))
                        count++;
                }

                ptr += sinWordLen;
                if (count == words.length) {
                    list.add(ptr);
                }
            }
        }

        return list;
    }
}