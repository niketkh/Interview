## [204. Count Primes](https://leetcode.com/problems/count-primes/description/)

Count the number of prime numbers less than a non-negative number, n

## Java Solutions

#### Solution using Sieve of Erathosthenes 
```
public int countPrimes(int n) {
    if(n <= 1) return 0;

    boolean prime[] = new boolean[n];
    int count = 0;

    Arrays.fill(prime, Boolean.TRUE);
	
    for(int i = 2; i < n; i++)
    {
        // If prime[i] is not changed, then it is a prime
        if(prime[i] == true)
        {   
            count++;
            // Update all multiples of i
            for(int j = i*2; j < n; j += i)
                prime[j] = false;
        }
    }

    return count;
}
```


#### Solution using Sieve of Erathosthenes - Optimised

```
public int countPrimes(int n) {
    if(n <= 1) return 0;

    boolean notPrime[] = new boolean[n];
    int count = 0;

    for(int i = 2; i < n; i++)
    {
        // If prime[i] is not changed, then it is a prime
        if(notPrime[i] == false)
        {   
            count++;
            // Update all multiples of i
            for(int j = i*2; j < n; j += i)
                notPrime[j] = true;
        }
    }

    return count;
}
```

