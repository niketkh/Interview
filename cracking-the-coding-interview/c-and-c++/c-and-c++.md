## C and C++

### 12.1 Last K Lines
Write a method to print the last K lines of input file using C++

### 12.2 Reverse String
Implement a function void reverse(char *str) in C or C++ which reverses a null terminated string
 
### 12.3 Hash Table vs STL Map
Compare and contrast a hash table and an STL map. How is a hash table implemented? If number of inputs is small, which data structure options can be used instead of hash table?

### 12.4 Virtual Functions
How do virtual functions work in C++?

### 12.5 Shallow vs Deep Copy
What is difference between deep copy and shallow copy? Explain how would you use each.

### 12.6 Volatile
What is the significance of keyword "volatile" in C?

### 12.7 Virtual Base Class
Why does a destructor in base class need to be declared virtual?

### 12.8 Copy Node
Write a method that takes a pointer to a Node structure as a parameter and returns a complete copy of the passed data structure. The Node data structure contains two pointers to other Nodes.

### 12.9 Smart Pointer
Write a smart pointer class. A smart pointer is a data type, usually implemented with templates, that simulates a pointer while also providing automatic garbage collection. It automatically counts the number of references to a SmartPointer<T*> object and frees the object of type T when reference count hits zero.

### 12.10 Malloc
Write an aligned malloc and free function that supports allocating memory such that memory address returned is divisible by a specific power of two.

```
align_malloc(1000, 128) will return a memory address that is multiple of 128 and that points to memory of size 1000 bytes
align_free() will free memory allocated by align_malloc.
```


### 12.11 2D Alloc
Write a function in C called my2DAlloc which allocates a two dimesional array. Minimize the number of calls to malloc and make sure that the memory is accessible by notation `arr[i][j]`