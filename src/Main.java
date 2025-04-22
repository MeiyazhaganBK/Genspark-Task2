public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addToEnd(5);
        myList.addToEnd(10);
        myList.addToEnd(20);
        myList.addToEnd(30);
        myList.addToEnd(40);
        myList.addToEnd(50);

        System.out.println("Initial Linked List:");
        myList.printList();
        System.out.println("-----------------------------");

        int totalNodes = myList.countNodes();
        System.out.println("Total Nodes: " + totalNodes);
        System.out.println("-----------------------------");

        myList.deleteLastNode();
        System.out.println("After Deleting the Last Node:");
        myList.printList();
        System.out.println("-----------------------------");

        myList.deleteAtPosition(0);
        System.out.println("After Deleting Node at Position 0:");
        myList.printList();
    }
}
