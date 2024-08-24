package leetcode;

/**
 *
 * @author Ayyoub
 * @link https://leetcode.com/problems/length-of-last-word/
 */
public class _0058_lengthOfLastWord {

   
    
    public static void main(String[] args) {
       
    }
    
        public int lengthOfLastWord(String s) {
    int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) == ' ')
      --i;
    final int lastIndex = i;
    while (i >= 0 && s.charAt(i) != ' ')
      --i;

    return lastIndex - i;
  }
}
