public class ListNode {

    // Stores the data for the current node
    private int data;

    // Reference to the next node in the list
    private ListNode next;

    // Constructor to initialize node with data and next reference
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    // Getter for data
    public int getData() {
        return data;
    }

    // Setter for data with simple validation (no negative values allowed)
    public void setData(int data) {
        if (data < 0) return;
        this.data = data;
    }

    // Getter for the next node reference
    public ListNode getNext() {
        return next;
    }

    // Setter for the next node reference
    public void setNext(ListNode next) {
        this.next = next;
    }
}
