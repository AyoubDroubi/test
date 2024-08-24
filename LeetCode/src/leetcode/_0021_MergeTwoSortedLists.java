package leetcode;

/**
 *
 * @author Ayyoub
 * @link https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class _0021_MergeTwoSortedLists {

    public static void main(String[] args) {
       
    }
    
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
    if (list1 == null || list2 == null)
      return list1 == null ? list2 : list1;
    if (list1.val > list2.val) {
      ListNode temp = list1;
      list1 = list2;
      list2 = temp;
    }
    list1.next = mergeTwoLists1(list1.next, list2);
    return list1;
  }
    
  public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
       if(list1 == null){
           return list2;
       }else if(list2 == null){
           return list1;
       }
       if(list1.val < list2.val){
           list1.next = mergeTwoLists2(list1.next, list2);
               return list1;   
       }else{
           list2.next = mergeTwoLists2(list1, list2.next);
           return list2;
       }


    }
}
    
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
