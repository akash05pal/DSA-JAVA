package linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class removeElement {
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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    //     class Solution {
    // public ListNode removeElements(ListNode head, int val) {
        // Handle empty list
        if(head == null) return head;
        
        // Handle cases where the head node(s) have the target value
        while(head != null && head.val == val) {
            head = head.next;
        }
        
        // If list becomes empty after removing head nodes
        if(head == null) return null;
        
        // Remove nodes with target value from the rest of the list
        ListNode prev = head;
        ListNode temp = head.next;
        
        while(temp != null) {
            if(temp.val == val) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        
        return head;
    }

}
}
