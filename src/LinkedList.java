public class LinkedList {

    private ListNode head;
    void addToEnd(int value) {
        ListNode newNode = new ListNode(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }


    void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }


    public int countNodes() {
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }


    void deleteLastNode() {
        // If list is empty
        if (head == null) return;

        // If there's only one node
        if (head.getNext() == null) {
            head = null;
            return;
        }


        ListNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
    }



    void deleteAtPosition(int position) {

        if (head == null || position < 0) return;
        if (position == 0) {
            head = head.getNext();
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; i < position; i++) {
            if (current == null) return;
            previous = current;
            current = current.getNext();
        }
        if (current == null) return;

        previous.setNext(current.getNext());
    }
}
