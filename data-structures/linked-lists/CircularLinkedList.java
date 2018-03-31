class Node<E> {
    public E data;
    public Node next;
    
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class MyCircularLinkedList<E> {
    
    private Node<E> head;
    private int size; 
        
    public MyCircularLinkedList() {
        head = null;
        size = 0;
    }
    
    // O(n) : Insert the specified element at beginning of list
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = newNode;
        
        if(head == null) { 
            head = newNode;
            size++;
            return;
        }
        
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        
        newNode.next = head;
        curr.next = newNode;
        head = newNode;
        
        size++;
    }
    
    // O(n) : Insert the specified element at end of list
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = newNode;
        
        if(size == 0) {
            addFirst(data);
            return;
        }
        
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        
        curr.next = newNode;
        newNode.next = head;
        size++;
    }
    
    // O(n) : Insert the specified element at the end of list
    public void add(E data) {
        addLast(data);
    }
    
    // O(n) : Insert the specified element at index (zero based) 
    public void add(int index, E data) {
        Node<E> newNode = new Node<>(data);
        
        if(index > size || index < 0) {
           throw new IndexOutOfBoundsException();
        }
        
        if(head == null || index == 0) {
            addFirst(data);
        }
        else if(index == size){
            addLast(data);
        }
        else {
            int i = 0;
            Node curr = head;
            Node prev = null;
            while(i < index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            
            prev.next = newNode;
            newNode.next = curr;
            size++;
        }
        
    }
    
    // Remove element from beginning of list
    public E removeFirst() {
        E temp = null;
        if(isEmpty()) {
            System.out.println("List is Empty");
            return temp;
        }
        
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        temp = head.data;
        if(size == 1)
            head = null;
        else {
            head = head.next;
            curr.next = head;
        }
        size--;

        return temp;
    }
    
    // Remove element from end of list
    public E removeLast() {
        E temp = null;
        Node<E> curr = head, prev = null;
        
        if(isEmpty()) {
            System.out.println("List is Empty");
            return temp;
        }
        
        while(curr.next != head) {
            prev = curr;
            curr = curr.next;
        }
        
        temp = curr.data;
        if(size == 1) {
            head = null;
        }
        else {
            prev.next = head;        
        }
        size--;
        return temp;
        
    }
    
    // Delete From Start
    public E remove() {
       return removeFirst();
    }
    
    // Remove element from index
    public E remove(int index) {
        E temp = null;
        int i = 0;
        
        if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        
        if(index == 0)  return removeFirst();
        else if(index == size()) return removeLast();
        else {
            Node<E> curr = head, prev = null;
            while(i < index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            
            if(prev != null && curr != null) {
                temp = curr.data;
                prev.next = curr.next;
                curr.next = null;
                size--;
            }
        }
        
        return temp;
        
    }
    
    public void removeAll() {
        head = null;
        size = 0;
    }
    
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public String toString() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while( curr != null) {
            sb.append(curr.data + " -> ");
            curr = curr.next;
            if(curr == head) break;
        }
        if(head != null) sb.append("(" + curr.data + ")");
        return sb.toString();
    }
    
}
public class Main {
    public static void main(String[] args) {
        MyCircularLinkedList<Integer> list = new MyCircularLinkedList<>();
        
        for(int i=0; i<=9; i++) list.addFirst(i);
        System.out.println(list);
        System.out.println(list.size());
        
        for(int i=8; i>=1; i--) list.remove(i);
        list.remove();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
    }
}