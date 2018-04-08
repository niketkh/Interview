class Node<E> {
    E data;
    Node<E> next;
    
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue<E> {
    Node<E> front, rear;
    int size;
    
    public MyQueue() {
        front = rear = null;
        size = 0;
    }
    
    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if(isEmpty()) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        
        size++;
    }
    
    public E dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return null;
        }
        
        E temp = front.data;
        if(size == 1) {
            front = rear = null;
        }
        else {
            front = front.next;
        }
        size--;
        
        return temp;
        
    }
    
    public E front() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return null;
        }
        
        return front.data;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = front;
        sb.append("[" + size + "]: ");
        for(int i=0; i<size; i++) {
            sb.append(curr.data + " ");
            curr = curr.next; 
        }
        
        return sb.toString();
    }
}

public class Main {
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        for(int i=0; i<10; i++) queue.enqueue(i);
        System.out.println(queue);
        for(int i=0; i<10; i++) queue.dequeue();
        System.out.println(queue);
    }
}