public class Demo {
    public static void createCut(ListNode headA,ListNode headB){
        headA.next.next = headB.next.next.next;
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode curA = list1;
        ListNode curB = list2;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while (curA != null && curB != null){
            if(curA.data < curB.data){
                tmp.next = curA;
                curA= curA.next;
                tmp = tmp.next;
            }else {
                tmp.next = curB;
                curB = curB.next;
                tmp = tmp.next;
            }
        }
        if(curA != null){
            tmp.next = curA;
        }
        if(curB != null){
            tmp.next=curB;
        }
        return node.next;
    }
}
