## Linked List

#### Advantages
```
-> Can be expanded in O(1) i.e constant time 
-> Does not require one block allocation. One can start with space for just one element
```

#### Disadvantages
```
-> Takes O(n) time to access element in worst case
-> Cannot take advantage of modern CPU caching methods as there is no special locality in memory
-> Hard to manipulate
-> Extra memory space required for pointers
```


## Arrays

#### Advantages
```
-> Constant access time i.e O(1)
-> Simple and easy to use
```

#### Disadvantages
```
-> Fixed size
-> One block allocation
-> Complex position based insertion
```

## Arrays vs Linked Lists
<img src="./linked-lists-vs-arrays.jpeg">

## Linked List Implementations

* [Singly Linked List](LinkedList.java)

Methods | Description | Time Complexity
--- | --- |:---:|
addFirst(E data)                | Add element to beginning of list  | O(1)     
addLast(E data) or add(E data)  | Add element to the end of list    | O(n)
add(int index, E data)          | Add element at index (zero based) | O(n)     
removeFirst() or remove()       | Remove element from beginning of list | O(1)
removeLast()                    | Remove element from end of list   | O(n)
remove(int index)               | Remove element from index (zero based) | O(n)
removeAll()                     | Remove all elements               | O(1)
size()                          | Returns size of list              | O(1)
isEmpty()                       | Checks whether list is empty      | O(1)


* [Doubly Linked List](DoublyLinkedList.java)

Methods | Description | Time Complexity
--- | --- | :---:
addFirst(E data)                | Add element to beginning of list  | O(1)     
addLast(E data) or add(E data)  | Add element to the end of list    | O(n)
add(int index, E data)          | Add element at index (zero based) | O(n)     
removeFirst() or remove()       | Remove element from beginning of list | O(1)
removeLast()                    | Remove element from end of list   | O(n)
remove(int index)               | Remove element from index (zero based) | O(n)
removeAll()                     | Remove all elements               | O(1)
size()                          | Returns size of list              | O(1)
isEmpty()                       | Checks whether list is empty      | O(1)


* [Circular Linked List](CircularLinkedList.java)

Methods | Description | Time Complexity
--- | --- | :---:
addFirst(E data)                | Add element to beginning of list  | O(n)     
addLast(E data) or add(E data)  | Add element to the end of list    | O(n)
add(int index, E data)          | Add element at index (zero based) | O(n)     
removeFirst() or remove()       | Remove element from beginning of list | O(n)
removeLast()                    | Remove element from end of list   | O(n)
remove(int index)               | Remove element from index (zero based) | O(n)
removeAll()                     | Remove all elements               | O(1)
size()                          | Returns size of list              | O(1)
isEmpty()                       | Checks whether list is empty      | O(1)
