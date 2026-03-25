package TwoPointers;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())return true;

        // String[] myS= s.split("[,\\.\\s\\:]");
        // String newS= Arrays.toString(myS).toLowerCase();
        String newS= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0;
        int r=newS.length()-1;
        while(l<r){
            if(newS.charAt(l)!=newS.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
