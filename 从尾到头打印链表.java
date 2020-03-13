import java.util.*;

class ListNode{
    public int val;
    public ListNode next = null;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class SingList {
    public ListNode head;
    public SingList(){
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //先进后出--->栈
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void addFirst(int val){
        ListNode node = new ListNode(val);
        if(this.head == null){
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int val){
        ListNode node = new ListNode(val);
        ListNode cur = this.head;
        if(this.head == null){
            this.head = node;
        }else {
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void addIndex(int val,int index){
        ListNode node = new ListNode(val);
        if(index < 0 || index > size()){
            System.out.println("输入的index不合法");
        }else if(index == 0){
            addFirst(val);
        }else {
            ListNode cur = searchIndex(index); //获得index位置的前驱节点
            node.next = cur.next;
            cur.next = node;
        }
    }
    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        for(int i = 0;i < index-1;i++){
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int key){  //是否存在关键字key
        ListNode cur = this.head;
        if(this.head == null){
            return false;
        }
        while (cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void remove(int key){  //删除关键字key
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null){
            System.out.println("没有该关键字");
        }else {
            ListNode cur = prev.next;
            prev.next = cur.next;
        }
    }
    private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while (prev.next != null){
            if(prev.next.val == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void removeAll(int key){  //删除所有key
        ListNode cur = this.head;
        ListNode tmp = this.head.next;
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
        while (tmp != null){
            if(tmp.val == key){
                cur.next = tmp.next;
                tmp.next = cur.next;
            }else {
                cur = tmp;
                tmp = cur.next;
            }
        }
    }

    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public void clear(){
        ListNode cur = this.head.next;
        while (this.head != null){
            this.head = null;
            this.head = cur;
        }
    }

    public void reverseList(){
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        if(this.head == null){
            System.out.println("链表为空");
            return;
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
    }

    public ListNode middleNode(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode findKthTail(int k ){  //倒数第k个节点
        ListNode fast = this.head;
        ListNode slow = this.head;
        if(k < 0 || this.head == null){
            return null;
        }
        while (k - 1 > 0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode partition(int x){
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null){
            if(cur.val < x){
                if(beforeStart == null){
                    beforeStart = cur;
                    beforeEnd = cur;
                }else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            }else {
                if(afterStart == null){
                    afterStart = cur;
                    afterEnd = cur;
                }else {
                    afterStart.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if(beforeEnd == null){
            return afterStart;
        }else {
            if(afterStart != null){
                afterEnd.next = null;
            }
            beforeEnd.next = afterStart;
            return beforeStart;
        }
    }


}
