class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode currentResult = dummy;
        ListNode curr = head.next;
        int currentSum = 0;

        while (curr != null) {
            if (curr.val == 0) {
                currentResult.next = new ListNode(currentSum);
                currentResult = currentResult.next;
                currentSum = 0;
            } else {
                currentSum += curr.val;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
