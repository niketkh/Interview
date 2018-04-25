## Searching

### Problem 1
Given an array of n numbers, give an algorithm for checking whether there are any duplicated elements in the array or not?

### Problem 2
Can we improve complexity of Problem 1's solution?

### Problem 3
Is there any other way of solving the Problem 1?

### Problem 4
Can we further improve complexity of Problem 1's solution? Assume that elements are in the range of 0 to n-1. That means all elements are within this range only.

### Problem 5
Given an array of n numbers. Give an algorithm for finding the element which appears maximum number of times in the array?

### Problem 6
Can we improve complexity of Problem 5's solution?

### Problem 7
Is there any other way of solving Problem 5?

### Problem 8
For Problem 5, can we further improve the time complexity? Assume that elements are in the range of 0 to n-1. That means all elements are within this range only.

### Problem 9
Given an array of n numbers, give an algorithm for finding the first element in the array which is repeated. For exampe, in the array, A = {3, 2, 1, 2, 2, 3} the first repeated number is 3 and not 2. That means, we need to return the first element among the repeated elements.

### Problem 10
For Problem 9, can we use sorting technique?

### Problem 11
For Problem 9, can we use hashing technique?

### Problem 12
For Problem 9, can we use Problem 3 technique (negation technique)?

### Problem 13 - Finding The Missing Number
We are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Given an algorithm to find the missing integer.

```
Input: [1, 2, 4, 6, 3, 7, 8]
Output: 5
```

### Problem 14
For Problem 13, can we use sorting technique?

### Problem 15
For Problem 13, can we use hashing technique?

### Problem 16
For Problem 13, can we further improve complexity?

### Problem 17
In Problem 13, if the sum of the number goes beyond maximum allowed integer, then there can be integer overflow and we may not get correct answer. Can we solve this problem?

### Problem 18 - Find The Number Occuring Odd Number Of Times
Given an array of positive integers, all numbers occurs even number of times except the one number which occurs odd number of times. Find the number in O(n) time and constant space.

### Problem 19 - Find The Two Repeating Elements in Given Array
Given an array with n+2 elements, all elements of the array are in the range 1 to n and also all elements occur only once except two numbers which occur twice. Find those two repeating numbers. 

```
Input: [4, 2, 4, 5, 2, 3, 1]
Output: 4 2
```

### Problem 20
For the Problem 19, can we improve time complexity?

### Problem 21
For the Problem 19, can we further improve time complexity?

### Problem 22
Consider the Problem 19. Let us assume that the numbers are in the range 1 to n. Is there any other way of solving the problem?

### Problem 23
Consider the Problem 19. Let us assume that the numbers are in the range 1 to n. Is there yet other way of solving the problem?

### Problem 24
Similar to Problem 19. Let us assume that numbers are in the range 1 to n. Also, n-2 elements are repeating thrice and remaining two elements are repeating twice. Find the element which is repeating twice.

### Problem 25
Given an array of an elements. Find two elements in the array such that their sum is equal to given element K?

### Problem 26
For Problem 25, can we improve the time complexity?

### Problem 27
Does the solution to Problem 25 works even if the array is not sorted?

### Problem 28
Is there any other way of solving the Problem 25?

### Problem 29
Given an array A of n elements. Find three elements i, j and k in the array such that A[i]<sup>2</sup> + A[j]<sup>2</sup> = A[k]<sup>2</sup>

### Problem 30 - Two Elements Whose Sum Is Closest To Zero
Given an array with both positive and negative numbers, find two elements such that their sum is closest to zero. 

```
Input: [1, 60 , -10, 70, -80, 85]
Output: -80 85
```

### Problem 31
Can we improve complexity of Problem 30?

### Problem 32 - 3 Sum
Given an array of n elements. Find three elements in the array such that their sum is equal to given element K?

### Problem 33
Does the solution to Problem 32 works even if array is not sorted?

### Problem 34
Can we use sorting technique to solve Problem 32?

### Problem 35
Can we use hashing technique to solve Problem 32?

### Problem 36
Given an array of n integers, the 3 sum problem is to determine find three integers whose sum is closest to zero.

### Problem 37
Let A be an array of n distinct integers. Suppose A has the following property, there exists an index 1 <= k <= n such that A[1]...A[k] is an increasing sequence and A[k+1]...A[n] is decreasing sequence. Design an algorithm for finding k?

### Problem 38
If we don't know n, how do we solve Problem 37?

### Problem 39
Given an array of size unknown with all 1's in the beginning and 0's in the end. Find the index in the array from where 0's start. Consider there are millions of 1's and 0's in the array.

### Problem 40
Given a sorted array of n integers that has been rotated an unknown number of times, give a O(logn) algorithm to find an element in array

```
Input: [ 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14]
Output: 8
```

### Problem 41
For Problem 40, can we solve in one scan?

### Problem 42 - Bitonic Search
An array is bitonic if it is comprised of an increasing sequence of integers followed immediately by decreasing sequence of integers. Given a bitonic array A of n distinct integers, describe how to determine whether a given integer is in the array in O(logn) steps.

### Problem 43
Is there any other way of solving Problem 37?

### Problem 44
Give a O(nlogn) algorithm for computing median of a sequence of n integers.

### Problem 45
Given two sorted lists of size m and n, find median of all elements in O(log(m + n)) time

### Problem 46
Given a sorted array A of n elements, possibly with duplicates, find the index of first occurence of a number in O(logn) time

### Problem 47
Given a sorted array A of n elements, possibly with duplicates, find the index of last occurence of a number in O(logn) time

### Problem 48
Given a sorted array of n elements, possibly with duplicates, find the number of occurences of a number

### Problem 49
Can we improve complexity of Problem 48?

### Problem 50
Is there any alternative way of solving Problem 48?

### Problem 51
What is the next number in the sequence 1, 11, 21, and why?

### Problem 52
Finding second smallest number efficiently?

### Problem 53
Is there any other way to solve Problem 52?

### Problem 54
An element is a majority if it appears more than n/2 times. Give an algorithm takes array of n element as argument and identifies a majority (if it exists)

### Problem 55
Can we improve Problem 54 time complexity to O(nlogn)?

### Problem 56
Is there any other of achieving O(nlogn) complexity for the Problem 54?

### Problem 57
Can we improve complexity for the Problem 54?

### Problem 58
Is there any other way to solve Problem 54?

### Problem 59
Given an array of 2n elements of which n elements are same and the remaining n elements are all different. Find majority elements?

### Problem 60
Given an array with 2n + 1 integer elements, n elements appear twice in arbitrary places in the array and a single integer appears only once somewhere inside. Find the lonely integer with O(n) time and O(1) space.

### Problem 61 - Throwing Eggs From N-Story Building
Suppose that we have an n story building and set of eggs. Also assume that egg breaks if it is thrown off a Floor F or higher, and will not break otherwise. Devise a strategy to determine the floor F, while breaking O(logn) eggs

### Problem 62 - Local Minimum Of An Array
Given an array A of n distinct integers, design O(logn) algorithm to find local minimum: an index i such that A[i-1] < A[i] < A[i+1]

### Problem 63
Given an `NxN` array of elements such that each row is in ascending order and each column is in ascending order, devise an O(n) algorithm to determine if a given element x is in the array. You may assume all elements in `NxN` array are distinct.

### Problem 64
Given an `NxN` array of n<sup>2</sup> numbers, give an O(n) algorithm to find a pair of indices i and j such that `A[i][j] < A[i+1][j], A[i][j] < A[i][j+1], A[i][j] < A[i-1][j], A[i][j] < A[i][j-1]` 

### Problem 65
Given `NxN` matrix, and in each row all 1's are followed by 0's. Find row with maximum number of 0's

### Problem 66
Given an input array of size unknown with all numbers in the beginning and special symbols in the end. Find the index in the array from where special symbols start.

### Problem 67 - Separate Even and Odd Numbers
Given an array A, write a function that segregates even and odd numbers. The fucntion should put all even numbers first and then odd numbers.

```
Input: [12, 34, 45, 9, 8, 90, 3]
Output: [12, 34, 90, 8, 9, 45, 3]
```

Note: Order of even and odd numbers is not important with in each subgroups

### Problem 68 - Separate 0's and 1's in an Array
We are given an array of 0's and 1's in random order. Separate 0's on the left and 1's on the right side of the array. Traverse array only once.

### Problem 69
Can we solve Problem 68 in one scan?

### Problem 70 - Sort an Array Of 0's, 1's and 2's
Given an array A, consisting of 0's, 1's and 2's give an algorithm for sorting A. The algorithm should put all 0's first then all 1's and all 2's in last

```
Input: [0, 1, 1, 0, 1, 2, 1 , 2, 0, 0, 0, 1]
Output: [0, 0, 0 , 0 , 0, 1, 1, 1, 1, 1, 2, 2]
```

### Problem 71  - Maximum Difference Between Two Elements
Given an array A of integers, find out the difference between any two elements such that larger element appears after the smaller number in A

```
Input: [2, 3, 10, 6, 4, 8, 1]
Output: 8 (Between 2 and 10)
```

### Problem 72  
Given an array of 101 elements. Out of them 25 elements are repeated twice, 12 elements are repeated 4 times and one element is repeated 3 times. Find the element which repeated 3 times in O(1)

### Problem 73  
Given a number n, give an algorithm for finding the number of trailing 0's in n!

### Problem 74  
Given an array of 2n integers in the following format a1 a2 a3...an b1 b2 b3...bn. Shuffle the array to a1 b1 a2 b2 a3 b3...an bn without any extra memory

### Problem 75  
Can we improve complexity of Problem 74 solution?

### Problem 76  
Given an array A, find the maximum j - i such that A[j] > A[i]

```
Input: [34, 8, 10, 3, 2, 80, 30 , 33, 1]
Output: 6 (j=7 and i=1)
```

### Problem 77  
Can we improve complexity of Problem 76's solution?

