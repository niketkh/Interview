## Queues

### Problems

#### Problem 1
Give an algorithm for reversing a queue Q. To access queue you are only allowed to use method enqueue and dequeue.

#### Problem 2
How to implement queue using two stacks? Analyze complexity.

#### Problem 3
How to implement stack using two queues? Analyze complexity.

#### Problem 4 - Maximum Sum in Sliding Window
Given array A[] with sliding window of size w which is moving from the very left of the array to the very right. Assume that we can only see the w numbers in the window. Each time the sliding window moves righwards by one position. 
```
Input: A[]
Output: B[], where B[i] is max value from A[i] to A[i+w-1]
```

#### Problem 5
Given a queue Q containing n elements, transfer these items on to a stack S (initially empty) so that front element of Q appears at the top of the stack and the order of all other items is preserved. Using enqueue and dequeue operations for the queue and push and pop operations for the stack, outline an efficient O(n) algorithm to accomplish the above task, using only constant additional space.

#### Problem 6
A queue is set up in circular array A[0..n-1] with front and rear defined as usual. Assume that n-1 locations in the array are available for storing elements (with the other element being used to detect full / empty condition). Give a formula for the number of elements in the queue in terms of front, rear and n.