## Stacks

Stack is a linear data structure. In stack, insertion and deletion are done from one end, where the end is called top. The last element inserted is the first one to be deleted. It follows Last In First Out (LIFO) principle. Also known as First In Last Out (FILO) principle.

**Operations on Stack:**
* `push()`
* `pop()`
* `peek()`
* `isEmpty()`

Trying to pop out an empty stack is called underflow and trying to push an element in a full stack is called overflow.

#### Applications
* Undo / Redo sequence of text editor
* Page visited history in a web browser
* Implementing function calls (including recursion)
* Balancing of symbols
* Infix to postfix conversion
* Evaluation of postfix expression
* Finding spans in stock markets
* Matching tags in HTML and XML

## Stack Implementations

### [Array Based](array-based-stack.java)

Methods | Description | Time Complexity
---|---|:---:
`push()`    | Pushes element to the top of stack    | O(1)
`pop()`     | Pops element from top of stack        | O(1)
`peek()`    | Returns element at the top of stack without removing it | O(1)
`isEmpty()` | Checks if stack is empty              | O(1)
`isFull()`  | Checks if stack is full               | O(1)
`size()`    | Returns size of stack                 | O(1)


### [Dynamic Array Based](dynamic-array-based-stack.java)

Methods | Description | Time Complexity
---|---|:---:
`push()`    | Pushes element to the top of stack    | O(n)
`pop()`     | Pops element from top of stack        | O(1)
`peek()`    | Returns element at the top of stack without removing it | O(1)
`isEmpty()` | Checks if stack is empty              | O(1)
`isFull()`  | Checks if stack is full               | O(1)
`size()`    | Returns size of stack                 | O(1)

### [ArrayList Based](arraylist-based-stack.java)

Methods | Description | Time Complexity
---|---|:---:
`push()`    | Pushes element to the top of stack    | O(1)
`pop()`     | Pops element from top of stack        | O(1)
`peek()`    | Returns element at the top of stack without removing it | O(1)
`isEmpty()` | Checks if stack is empty              | O(1)
`size()`    | Returns size of stack                 | O(1)


### [Linked List Based](linked-list-based-stack.java)


Methods | Description | Time Complexity
---|---|:---:
`push()`    | Pushes element to the top of stack    | O(1)
`pop()`     | Pops element from top of stack        | O(1)
`peek()`    | Returns element at the top of stack without removing it | O(1)
`isEmpty()` | Checks if stack is empty              | O(1)
`isFull()`  | Checks if stack is full               | O(1)
`size()`    | Returns size of stack                 | O(1)
