class MyStack<E> {
    private int top;
    private int capacity;
    private List<E> list;
    
    public MyStack() {
        capacity = 1;
        list = new ArrayList<>();
        top = -1;
    }
    
    public void push(E data) {
        list.add(data);
    }
    
    public E pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return list.remove(size() - 1);
    }
    
    public E peek() {
        return list.get(size() -1);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int size() {
        return list.size();
    }
    
}


public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        for(int i=0; i<10; i++) stack.push(i);
        for(int i=0; i<10; i++) System.out.println(stack.pop());
    }
}