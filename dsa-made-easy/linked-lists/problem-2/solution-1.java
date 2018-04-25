class MyLinkedList {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    
    public MyLinkedList() {
        head = null;
    }
    
    // Add element at the beginning of list
    public void add(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }
    
    // Traversing List Twice and Using size of list
    // Time Complexity: O(n)
    public int getNthNodeFromEnd(int n) {
        int size = 0;
        Node curr = head;
        
        if(head == null) return Integer.MIN_VALUE;
        
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        
        if(n > size) return Integer.MIN_VALUE;
        else {
            int nth = size - n + 1;
            int count = 0;
            curr = head;
            while(curr != null) {
                count++;
                if(count == nth) return curr.data;
                curr = curr.next;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public String toString() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data + " -> ");
            curr = curr.next;
        }
        sb.append("NULL");
        
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        for(int i=0; i<10; i++) list.add(i);
        System.out.println(list);
        System.out.println(list.getNthNodeFromEnd(5));
    }
}