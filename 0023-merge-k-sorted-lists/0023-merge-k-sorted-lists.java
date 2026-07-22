/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {//recurision method
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists==null || lists.length == 0) return null;
      return divideList(lists,0,lists.length-1);  
    }
    public ListNode divideList(ListNode []lists,int left,int right){
        if(left==right)return lists[left];
        int mid = left+(right-left)/2;
        ListNode l1 = divideList(lists,left,mid);
        ListNode l2 = divideList(lists,mid+1,right);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!=null&&b!=null){
            if(a.val<=b.val){
                tail.next= a;
                a= a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a!=null){
            tail.next = a;
        }else{
            tail.next =b;
        }
        return dummy.next;
    }
}