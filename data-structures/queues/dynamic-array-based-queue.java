class MyQueue {
    private int capacity, size;
    private int front, rear;
    private int array[];
    
    public MyQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(int data) {
        if(isFull()) {
            resize();
        }
        
        rear = (rear + 1) % capacity;
        array[rear] = data;
        size++;
        if(front == -1) front = rear;
    }
    
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return Integer.MIN_VALUE;
        }
        
        int temp = array[front];
        if(front == rear && size == 1) 
            front = rear = -1;
        else {
            front = (front + 1) % capacity;
        }
        size--;
        return temp;
        
    }
    
    public int front() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return Integer.MIN_VALUE;
        }
        
        return array[front];
    }
    
    public void resize() {
        int newCapacity = 2*capacity;
        int newArray[] = new int[newCapacity];
        
        int index = front;
        for(int i=0; i<size; i++) {
            newArray[i] = array[index];
            index = (index + 1) % capacity;
        }
        
        front = 0;
        rear = size-1;
        capacity = newCapacity;
        array = newArray;
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        // return (rear + 1) % capacity == front;
        return size == capacity;
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int index = front;
        sb.append("[" + size + "]: ");
        for(int i=0; i<size; i++) {
            sb.append(array[index] + " ");
            index = (index + 1) % capacity;
        }
        
        return sb.toString();
    }
}

public class Main {
    
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        
        for(int i=0; i<15; i++) queue.enqueue(i);
        System.out.println(queue);
        
        for(int i=0; i<10; i++) queue.dequeue();
        System.out.println(queue);
        
        for(int i=0; i<5; i++) queue.enqueue(i);
        System.out.println(queue);
    }
}