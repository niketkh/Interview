class MyStack {
    private int top;
    private int capacity;
    private int array[];
    
    public MyStack() {
        capacity = 1;
        array = new int[capacity];
        top = -1;
    }
    
    public void push(int data) {
        if(isFull()) {
            increaseCapacity();
        }
        
        array[++top] = data;
    }
    
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        return array[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public int size() {
        return top + 1;
    }
    
    public void increaseCapacity() {
        int newArray[] = new int[capacity * 2];
        System.arraycopy(array, 0, newArray, 0, capacity);
        capacity *= 2;
        array = newArray;
    }
}


public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        
        for(int i=0; i<10; i++) stack.push(i);
        for(int i=0; i<10; i++) System.out.println(stack.pop());
    }
}