package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(2);
        myDLL.append(1);

        myDLL.swapPairs();
        myDLL.printList();;
    }
}
