## [326. Power of Three](https://leetcode.com/problems/power-of-three/)

Given an integer, write a function to determine if it is a power of three.


## Java Solutions

#### Continuously dividing by 3 - Iterative
```
public boolean isPowerOfThree(int n) {
    if(n<=0) return false;
    while(n % 3 == 0) n /= 3;
    
    return (n == 1);
}
```

#### Continuously dividing by 3 - Recursive
```
public boolean isPowerOfThree(int n) {
    return n>0 && (n==1 || (n%3==0 && isPowerOfThree(n/3)));
}
```

#### Converting to Radix 3 and do string match
```
// The idea is to convert the original number into radix-3 format and check if it is of format 10* where 0* means k zeros with k>=0.
public boolean isPowerOfThree(int n) {
    return Integer.toString(n, 3).matches("10*");
}
```

#### Cheat Solution - Storing all power of 3 in INT range in Array and using binary search
```
public boolean isPowerOfThree(int n) {
    int[] allPowerOfThree = { 1, 3, 9, 27, 81, 243, 729, 2187, 
		6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 
		14348907, 43046721, 129140163, 387420489, 1162261467
	};
    return Arrays.binarySearch(allPowerOfThree, n) >= 0;
}
```

#### Cheat Solution - Storing all power of 3 in INT range in HashSet 
```
public boolean isPowerOfThree(int n) {
    HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467));
    return set.contains(n);
}
```

#### Cheat Solution - Checking if number divides 3^19 which is highest power of 3 in INT range
```
public boolean isPowerOfThree(int n) {
    // 1162261467 is 3^19,  3^20 is bigger than int  
    return ( n > 0 &&  1162261467 % n == 0);
}
```