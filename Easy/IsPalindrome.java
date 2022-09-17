package Easy;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char [] sArray = s.toCharArray();
        for(int i = 0, j = s.length() ; i < j; i++, j-- ){
            if(i < s.length() && !Character.isLetterOrDigit(sArray[i])){
                i++;
            }

            if(j <= 0 &&!Character.isLetterOrDigit(sArray[j])){
                j--;
            }

            if(sArray[i]!= sArray[j]){
                return false;
            }
        }
        return true;
    }
}
