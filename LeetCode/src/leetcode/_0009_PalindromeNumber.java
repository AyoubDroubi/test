package leetcode;

/**
 *
 * @author Ayyoub
 * @link https://leetcode.com/problems/palindrome-number/description/
 */
public class _0009_PalindromeNumber {

    public boolean isPalindrome(int x) {

    String word = Integer.toString(x);
    int length = word.length();
    String reverse="";
    for ( int i = length - 1 ; i >= 0 ; i-- )
        reverse = reverse + word.charAt(i);
    if (word.equals(reverse))
        return true;
    else
        return false;
    }
    
    public static void main(String[] args) {
       
    }
    
    
}
