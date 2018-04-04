## Queues

Queue is a linear data structure. It is an ordered list in which insertions are done at one end (rear) and deletions are done from the other end (front). The first element to be inserted is the first one to be deleted. It follows First In First Out (FIFO) principle.

**Operations on Queue:**
* `enqueue()`
* `dequeue()`
* `front()`
* `isEmpty()`
* `size()`

#### Applications 
* Operating systems schedule jobs (with equal priority) in the order of arrival (e.g., print queue)
* Asynchronous data transfer (file IO, pipes, sockets)
* Simulation of real world queues such as lines at ticket counter or any other first come first served scenario
* Multiprogramming
* Waiting time of customers at call center
* Determining number of cashiers to have at supermarket

## Queue Implmentations

### Circular Array Based

Methods | Description | Time Complexity
---|---|:---:
`enqueue()`      
`dequeue()`
`front()`
`isEmpty()`
`size()`

### Dynamic Circular Array Based

### Linked List Based
