class Node<E> {
    public E data;
    public Node next;
    
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList<E> {
    
    private Node<E> head;
    private int size; 
        
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Insert the specified element at beginning of list
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Insert the specified element at end of list
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        
        if(head == null) {
            addFirst(data);
            return;
        }
        
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        size++;
    }
    
    // Insert the specified element at the end of list
    public void add(E data) {
        addLast(data);
    }
    
    // Insert the specified element at index (zero based) 
    public void add(int index, E data) {
        Node<E> newNode = new Node<>(data);
        
        if(index > size || index < 0) {
            System.out.println("Invalid index to add. Valid inputs for index: 0 to " + size);
            return;
        }
        
        // Insert At Start
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
            while(i < index && curr != null) {
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
        if(!isEmpty()) {
            temp = head.data;
            head = head.next;
            size--;
        }
        
        if(size == 0) head = null;
        
        return temp;
    }
    
    // Remove element from end of list
    public E removeLast() {
        E temp = null;
        Node<E> curr = head, prev = null;
        
        if(size() == 1) return remove();
        
        while(curr != null && curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        
        if(prev != null && curr != null) {
            temp = curr.data;
            prev.next = null;
            size--;
        }
        
        if(size == 0) head = null;
        
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
        
        if(index == 0)  return remove();
        else if(index == size()) return removeLast();
        else {
            Node<E> curr = head, prev = null;
            while(i < index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            
            prev.next = curr.next;
            temp = curr.data;
            size--;
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
        }
        sb.append("NULL");
        
        return sb.toString();
    }
    
}
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for(int i=0; i<10; i++)
            list.add(i, i);
        
        System.out.println(list);
        
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--)
            list.remove(i);
        System.out.println(list);
        System.out.println(list.size());
    }
}