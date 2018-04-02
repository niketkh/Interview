## 121. Best Time to Buy and Sell Stock
Say you have an array for which the i<sup>th</sup> element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

**Example 1:**
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```

**Example 2:**
```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
```


## Java Solution

#### Brute Force - TLE : O(n<sup>2</sup>)

```
public int maxProfit(int[] prices) {
    int maxProfit = 0, currentMax = 0;
    for(int i=0; i<prices.length; i++) {
        for(int j=i+1; j<prices.length; j++) {
                int profit = prices[j] - prices[i];
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }
    }
    
    return maxProfit;
}
```

#### One Pass 
Say the given array is:

`[7, 1, 5, 3, 6, 4]`

If we plot the numbers of the given array on a graph, we get:

<img src="121-best-time-to-buy-and-sell-stock.png">

The points of interest are the peaks and valleys in the given graph. We need to find the largest peak following the smallest valley. We can maintain two variables - minPrice and maxProfit corresponding to the smallest valley and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.

```
public int maxProfit(int prices[]) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice)
            minPrice = prices[i];
        else if (prices[i] - minPrice > maxProfit)
            maxProfit = prices[i] - minPrice;
    }
    return maxProfit;
}
```
