## [273. Integer to English Words](https://leetcode.com/problems/integer-to-english-words/description/)

Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 2<sup>31</sup> - 1.

For example,
```
123 -> "One Hundred Twenty Three"
12345 -> "Twelve Thousand Three Hundred Forty Five"
1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
```

## Java Solutions

#### Recursive Solution

```
class Solution {
    Map<Integer, String> map = new HashMap<Integer, String>() 
    {{
        put(0, "Zero");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
        put(20, "Twenty");
        put(30, "Thirty");
        put(40, "Forty");
        put(50, "Fifty");
        put(60, "Sixty");
        put(70, "Seventy");
        put(80, "Eighty");
        put(90, "Ninety");
        put(100, "Hundred");
        put(1000, "Thousand");
        put(1000000, "Million");
        put(1000000000, "Billion");
    }};
        
    public String numberToWords(int num) {
        if(num == 0) return map.get(0);
        if( num < 0) return "Negative " + toWords(Math.abs(num));
        
        return toWords(num);
    }
    
    public String toWords(int num) {
        if(num >= 1000000000) 
            return (toWords(num / 1000000000) + " " + map.get(1000000000) + " " + toWords(num % 1000000000)).trim();
        else if(num >= 1000000) 
            return (toWords(num / 1000000) + " " + map.get(1000000) + " " + toWords(num % 1000000)).trim();
        else if(num >= 1000) 
            return (toWords(num / 1000) + " " + map.get(1000) + " " + toWords(num % 1000)).trim();
        else if(num >= 100) 
            return (toWords(num / 100) + " " + map.get(100) + " " + toWords(num % 100)).trim();
        else if(num >= 20) 
            return (map.get((num/10) * 10) + " " + toWords(num % 10)).trim();
        else if(num > 0) 
            return map.get(num);
        
        return "";
    }

}

```


#### Recursive Solution - Method 2

```
private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

public String numberToWords(int num) {
    if (num == 0) return "Zero";

    int i = 0;
    String words = "";
    
    while (num > 0) {
        if (num % 1000 != 0)
    	    words = helper(num % 1000) +THOUSANDS[i] + " " + words;
    	num /= 1000;
    	i++;
    }
    
    return words.trim();
}

private String helper(int num) {
    if (num == 0)
        return "";
    else if (num < 20)
        return LESS_THAN_20[num] + " ";
    else if (num < 100)
        return TENS[num / 10] + " " + helper(num % 10);
    else
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
}

```