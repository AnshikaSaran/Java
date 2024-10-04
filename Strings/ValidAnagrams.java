import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        int[] frequency1 = new int[256]; 
        int[] frequency2 = new int[256]; 
 
        for (int i = 0; i < s.length(); i++) {
            frequency1[s.charAt(i)]++;
            frequency2[t.charAt(i)]++;
        }

        return Arrays.equals(frequency1, frequency2);

    }

}
