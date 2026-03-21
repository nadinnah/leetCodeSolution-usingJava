public class validAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sToCharArr= s.toCharArray(); // a n a g r a m
        char[] tToCharArr= t.toCharArray();// n a g a r a m
        int[] isAnagram= new int[26];

        for(int i=0; i<sToCharArr.length;i++){
            if (s.length() != t.length()) return false;
            isAnagram[sToCharArr[i]-'a']+=1;
            isAnagram[tToCharArr[i]-'a']-=1;
        }

        for (int count : isAnagram) {
            if (count != 0) return false;
        }

        return true;

    }
}
