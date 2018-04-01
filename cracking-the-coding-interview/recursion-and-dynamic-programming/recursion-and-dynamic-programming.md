## Recursion and Dynamic Programming

### 8.1 Triple Step
A child is running up a staircase with n steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

### 8.2 Robot in a Grid
Imagine a robot sitting on the upper left corner of grid with r rows and c columns. The robot can only move in two directions, right and down, but certain cells are "off limits" such that the robot cannot step on them. Design an algorithm to find a path for the robot from top left to the bottom right.

### 8.3 Magic Index
A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted array of distinct integers, write a method to find magic index, if one exists, in array A.

### 8.4 Power Set
Write a method to return all subsets of a set

### 8.5 Recursive Multiply 
Write a recursive function to multiply two positive integers without using the * operator. You can use additon, subtraction, and bit shifting, but you should minimize the number of those operations.

### 8.6 Towers of Hanoi
In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have following constraints:

* Only one disk can be moved at a time
* A disk is slid off the top of one tower onto another tower
* A disk cannot be placed on the top of smaller disk.

Write a program to move disks from the first tower to last using stacks.

### 8.7 Permutation without Duplicates
Write a method to compute all permutations of string of unique characters.

### 8.8 Permutation with Duplicates
Write a method to compute all permutations of a string whose characters are not necessarily unique. The list of permutations should not have duplicates.

### 8.9 Parentheses
Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n pairs of parentheses

```
Input: 3
Output: ((())), (()()), (())(), ()(()), ()()()
```

### 8.10 Paint Fill
Implement the "paint fill" function that one might see on many image editing programs. That is, given a screen (represented by two-dimesional array of colors), a point, and a new color, fill the surrounding area until the color changes from original color.

### 8.11 Coins
Given an infinte number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent), write code to calculate number of ways of representing n cents.

### 8.12 Eight Queens
Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board so that none of them share the same row, column, or diagonal. In this case diagonals means all diagonals, not just two that bisect the board.

### 8.13 Stack of Boxes
You have a stack of n boxes, with width w<sub>1</sub>, height h<sub>1</sub>, and depth<sub>1</sub>. The boxes cannot be rotated andcan only be stacked on top of one another if each box in the stack is strictly larger than the box above it in width, height and depth. Implement a method to computethe height of the tallest possiblestack. The height of stack is the sum of heights of each box.

### 8.14 Boolean Evaluation
Given a boolean expression consisting of the symbols 0 (false), 1 (true), & (AND), | (OR), and ^ (XOR), and a desired boolean result, implement a function to count the number of ways of parenthesizing the expression such that it evaluates to the result.

```
EXAMPLE
countEval("1^1|0|1", false) -> 2
countEval("0&0&0&1^1|0", true) -> 10
```

