class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_letters = s.toCharArray();
        char[] t_letters = t.toCharArray();
        Arrays.sort(s_letters);
        Arrays.sort(t_letters);
        if(s_letters.length != t_letters.length) return false;

        for(int i=0;i<s_letters.length;i++)
        {
            if(s_letters[i]!=t_letters[i]) return false;
        }
        return true;

    }
}
