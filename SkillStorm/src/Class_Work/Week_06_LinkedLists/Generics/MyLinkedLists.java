package Class_Work.Week_06_LinkedLists.Generics;

public class MyLinkedLists<T> { // The <T> tells Java it's a generic

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Generics   ***********************************************////
    ///////////////////////////////////////////////////////////////////////////////////

    // Usually denoted by:
    // T - Type
    // E - Element
    // K - Keys
    // N - Numbers
    // V - Value
    // Can be any class but not a primitive

    // Variables
    private Node head; // first element is my LinkedList
    private Node tail;
    private int size;

    // Constructor
    public MyLinkedLists() {
        head = null;
        tail = null;
        size =0;
    }

    // Methods
    public void add(T t) {
        if (size == 0) {
            Node n = new Node(t);
            head = n; // Setting head
            tail = n; // This node is the first and only right now
            size++;
        } else {
            Node n = new Node(t);
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Getter
    public int getSize() {
        return this.size;
    }

    // Inner Classes
    private class Node { // Inner class only usable within MyLinkedList class
        private Node next; // each Node knows where the next one is
        private T data;  // Each Node knows what data it has

        public Node (T t) {
            next = null;
            data = t;
        }
    }
}
