## [461. Hamming Distance](https://leetcode.com/problems/hamming-distance/description/)

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

**Note:**
0 ≤ `x, y` < 2<sup>31</sup>.

```
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
```

## Java Solution

#### Using Exor and Counting Set Bits
```
// 0 ^ 1 = 1 ^ 0 = 1 and 0 ^ 0 = 1 ^ 1 = 0
public int hammingDistance(int x, int y) {
    int exor = x ^ y;
    int count = 0;
    while(exor > 0) {
        count += exor & 1;
        exor >>= 1;
    }
    
    return count;
}
```

#### Using Exor and Integer.bitCount
```
public int hammingDistance(int x, int y) {
    int exor = x ^ y;
    return Integer.bitCount(exor);
}
```