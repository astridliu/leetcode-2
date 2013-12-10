public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        Map<String, Boolean> wordMap = new HashMap<String, Boolean>();
        for (String w : dict) {
        	wordMap.put(w, true);
        }
        int len = s.length();
        boolean[] strMap = new boolean[len + 1];
        strMap[0] = true;
        for (int i = 1; i <= len; i++) {
        	for (int j = 0; j < i; j++) {
        		if (strMap[j] && wordMap.containsKey(s.substring(j, i))) {
        			strMap[i] = true;
        		}
        	}
        }
        return strMap[len];
    }
}