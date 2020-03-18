import com.sun.org.apache.xerces.internal.impl.xs.util.StringListImpl;
import com.sun.org.apache.xerces.internal.xs.StringList;


public class Demo {
    public static void createCut(ListNode headA,ListNode headB) {
        headA.next.next = headB.next.next.next;
    }

    //两个拼接
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while (curA != null && curB != null){
            if(curA.data < curB.data){
                tmp.next = curA;
                curA = curA.next;
                tmp = tmp.next;
            }else{
                tmp.next = curB;
                curB = curB.next;
                tmp = tmp.next;
            }
        }
        if(curA != null){
            tmp.next = curA;
        }
        if(curB != null){
            tmp.next = curB;
        }
        return node.next;
    }

    //交点
    public static ListNode  getIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB == null) {
            return null;
        }
        //pL永远指向最长的单链表
        ListNode pL = headA;
        //pS永远指向最短的单链表
        ListNode pS = headB;

        //分别求长度
        int lenA = 0;
        while(pL != null){
            lenA++;
            pL = pL.next;
        }
        int lenB = 0;
        while(pS != null){
            lenB++;
            pS = pS.next;
        }

        //求长度的差值,如果是负数-》pL = headB;  pS = headA
        int len = lenA-lenB;
        if(len < 0){
            len = lenB - lenA;
            pL = headB;
            pS = headA;
        }else {
            pL = headA;
            pS = headB;
        }

        //只需要让pL走len步就好了
        while (pL != null && len > 0){
            pL = pL.next;
            len--;
        }
        //走完len步之后  两个同时开始走
        //一直走 走到next值相同时 就是交点
        while (pL!= null && pL != pS){
            pL = pL.next;
			pS = pS.next;
        }
        if(pL == pS && pS != null ){
            return  pL;
        }
        return null;
    }


    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.addFirst(15);
        singleList.addFirst(10);
        singleList.addFirst(7);
        singleList.addFirst(4);
        singleList.addFirst(2);
        singleList.display();
        System.out.println("\n");
        ListNode tmp = singleList.partition(1);
        singleList.display1(tmp);
//        SingleList singleList1 = new SingleList();
//        singleList1.addFirst(14);
//        singleList1.addFirst(11);
//        singleList1.addFirst(9);
//        singleList1.addFirst(8);
//        singleList1.addFirst(6);
//        singleList1.display();
//        System.out.println("\n");
//        ListNode node = mergeTwoLists(singleList.head,singleList1.head);
//        singleList.display1(node);
//        Demo.createCut(singleList.head,singleList1.head);
//        System.out.println(getIntersectionNode(singleList.head,singleList1.head).data);
//        singleList.display();
//        singleList.createLoop();
//        ListNode ret = singleList.detectCycle();
//        System.out.println(ret.data);
//        int count = singleList.lengthList();
//        System.out.println(count);
//        ListNode node = singleList.deleteDuplication();
//        singleList.display1(node);
//        singleList.display();
//        System.out.println("-------------------");
//        singleList.addLast(6);
//        singleList.display();;
//        System.out.println("-------------------");
//        singleList.remove(4);
//        singleList.display();;
//        System.out.println("-------------------");
//        singleList.removeAll(2);
//        singleList.display();;
//        System.out.println("-------------------");
//        singleList.reverseList();
//        singleList.display();;
//        System.out.println("-------------------");
//        ListNode cur = singleList.middleNode();
//        System.out.println(cur.data);
//        System.out.println("-------------------");
//        ListNode temp = singleList.findKthTail(2);
//        System.out.println(temp.data);
//        System.out.println("-------------------");
//        singleList.display();
//        System.out.println("-------------------");
//        singleList.clear();
//        singleList.display();
//        System.out.println("-------------------");
    }
}
