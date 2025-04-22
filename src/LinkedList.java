
public class LinkedList {
    private ListNode head;

    // First function....
    void addListNodeToTheEndOfLinkedList(int value) {

        //step 1. Create the () -> ListNode and assign the value 40
        ListNode newNode = new ListNode(value,null);


        // if LL is empty
//      how to identify LL is empty or not.

        if(head == null) {
            head = newNode;
            return;
        }

        //step 2. link it to the last node of the existing linkedlist.
        ListNode temp = head;
        // we can identify the last node by looking at the next
        // attribute , if it contains null => lastNode.
        // next of some node ==> null => lastNode.
        // next of some node doesn't contain ==> intermediate node | first node.
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }

        // we are standing on the last node by using temp
        temp.setNext(newNode);
        newNode.setNext(null);
    }
    void traverseTheLinkedList() {
        ListNode temp = head;
        // Iterate every node one by one and after reaching to
        // the last node the temp will point to the null.
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

        // we have traversed the entire ll and my temp is now
        // pointing to the null[which comes after the last nodes].

    }
    public int countNodesofLinkedList() {
        // we have seen that we can traverse through while.
        // traverse through for loop.

        int count = 0;
        ListNode temp = head;
        while(temp!=null) {
            count++;
            temp=temp.getNext();
        }
        return count;
    }

    void deleteTheLastListNode() {
        if(head == null) {
            return;
        }
        if(head.getNext() == null) {
            head = null;
            return;
        }
        ListNode temp1 = head;
        while (temp1.getNext().getNext() != null) {
            temp1 = temp1.getNext();
        }
        temp1.setNext(null);
    }

    void deleteTheNodeAtKthPosition(int k) {

        if (head == null || k < 0)
            return;
        if (k == 0) {
            head = head.getNext();
            return;
        }
        ListNode temp1 = head;
        ListNode temp2 = null;

        for (int i = 0; i < k; i++) {
            if (temp1 == null)
                return;
            temp2 = temp1;
            temp1 = temp1.getNext();
        }
        if (temp1 == null)
            return;
        temp2.setNext(temp1.getNext());
    }
}