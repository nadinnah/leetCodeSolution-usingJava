import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();

        for(int i=0;i<strs.length;i++){
            //reset the alphabet count every time inside the loop.
            int[] alphabetCount= new int[26];
            char[] splitStrs= strs[i].toCharArray();
            for(int j=0;j<splitStrs.length;j++){
                alphabetCount[splitStrs[j]-'a']+=1;
            }
            String key= Arrays.toString(alphabetCount);
            map.putIfAbsent(key, new ArrayList<>());
            //add() is a method of ArrayList
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
