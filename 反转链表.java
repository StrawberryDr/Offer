class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class SingList {
    public ListNode head;
    public SingList(){
    }

    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        if(this.head == null){
            System.out.println("链表为空");
            return null;
        }
        while (cur != null){
            ListNode curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = newHead;
        return head;
    }
}
