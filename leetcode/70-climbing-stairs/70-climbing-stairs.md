## 70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

**Example 1:**
```
Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
```

**Example 2:**
```
Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```


## Java Solution 

#### Using Recursion - Brute Force : O(2<sup>n</sup>) causes TLE
```
public class Solution {
    // Time Complexity: O(2^n)
    // Space complexity: O(n)
    public int climbStairs(int n) {
        return _climbStairs(0, n);
    }
    public int _climbStairs(int i, int n) {
        if (i > n) {
            return 0;
        }

        if (i == n) {
            return 1;
        }
        return _climbStairs(i + 1, n) + _climbStairs(i + 2, n);
    }
}
```

#### Using Memoization
In the previous approach we are redundantly calculating the result for every step. Instead, we can store the result at each step in memomemo array and directly returning the result from the memo array whenever that function is called again.

In this way we are pruning recursion tree with the help of memomemo array and reducing the size of recursion tree upto nn

```
public class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return _climbStairs(0, n, memo);
    }
    public int _climbStairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = _climbStairs(i + 1, n, memo) + _climbStairs(i + 2, n, memo);
        return memo[i];
    }
}
```

#### Using Dynamic Programming : O(n)
As we can see this problem can be broken into subproblems, and it contains the optimal substructure property i.e. its optimal solution can be constructed efficiently from optimal solutions of its subproblems, we can use dynamic programming to solve this problem.

One can reach i<sup>th</sup> step in one of the two ways:

1. Taking a single step from (i-1)<sup>th</sup>​ step.
2. Taking a step of 2 from (i-2)<sup>th</sup> step.

So, the total number of ways to reach i<sup>th</sup> step is equal to sum of ways of reaching (i-1)<sup>th</sup>​ step and ways of reaching (i-2)<sup>th</sup> step.

Let `dp[i]` denotes the number of ways to reach i<sup>th</sup> step

`dp[i]=dp[i-1]+dp[i-2]`

```
// Time Complexity: O(n)
// Space Complexity: O(n)
public int climbStairs(int n) {
    if(n == 0 || n == 1) return 1;

    int dp[] = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;

    for(int i=2; i<=n ; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }

    return dp[n];
}
```

#### Nth fibonacci number : O(n)
In the above approach we have used `dp` array where `dp[i]=dp[i-1]+dp[i-2]`. It can be easily analysed that `dp[i]` is nothing but i<sup>th</sup> fibonacci number.

`Fib(n)=Fib(n-1)+Fib(n-2)`

```
// Time Complexity: O(n)
// Space Complexity: O(1)
public int climbStairs(int n) {
    if (n == 1) {
        return 1;
    }
    int first = 1;
    int second = 2;
    for (int i = 3; i <= n; i++) {
        int third = first + second;
        first = second;
        second = third;
    }
    return second;
}
```

### [Binet's Method to calculate nth fibonacci](https://leetcode.com/problems/climbing-stairs/solution/) : O(logn)

### [Nth fibonacci using formula](https://leetcode.com/problems/climbing-stairs/solution/) : O(logn)