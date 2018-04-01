class Node<E> {
    public E data;
    public Node<E> next;
    
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack<E> {
    private Node<E> top;
    private int size;
    
    public MyStack() {
        top = null;
        size = 0;
    }
    
    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public E pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        
        E temp = top.data;
        top = top.next;
        size--;
        return temp;
    }
    
    public E peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public int size() {
        return size;
    }
    
}


public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        System.out.println("Size: " + stack.size());
        for(int i=0; i<15; i++) stack.push(i);
        System.out.println("Size: " + stack.size());
        for(int i=0; i<10; i++) System.out.println(stack.pop());
        System.out.println("Size: " + stack.size());
    }
}