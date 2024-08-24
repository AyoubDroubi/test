package leetcode;

/**
 *
 * @author Ayyoub
 * @link https://leetcode.com/problems/plus-one/description/
 */
public class _0066_PlusOne {

   
    
    public static void main(String[] args) {
       
    }
    
public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        ++digits[i];
        return digits;
      }
      digits[i] = 0;
    }

    int[] ans = new int[digits.length + 1];
    ans[0] = 1;
    return ans;
  }
  }

