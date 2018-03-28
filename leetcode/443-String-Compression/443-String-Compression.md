## [443. String Compression](https://leetcode.com/problems/string-compression/description/)

Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.


Follow up:
Could you solve it using only O(1) extra space?

###### Example 1:
```
Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
```

###### Example 2:
```
Input:
["a"]

Output:
Return 1, and the first 1 characters of the input array should be: ["a"]

Explanation:
Nothing is replaced.
```

###### Example 3:
```
Input:
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

Output:
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

Explanation:
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.
```

###### Note:
1. All characters have an ASCII value in ```[35, 126]```.
2. ```1 <= len(chars) <= 1000```

## Java Solution

#### Method 1

```
public int compress(char[] chars) {
    if(chars.length == 0) return 0;
    int count = 1, index = 0;
    for(int i=1; i<chars.length; i++) {
        if(chars[i-1] == chars[i]) count++;
        else {
            if(count > 1) { 
                char[] arr = ("" + count).toCharArray();
                for(char c: arr) chars[++index] = c;
            }
            
            chars[++index] = chars[i];
            count = 1;
        }
    }
    
    if(count != 1) {
        if(count > 1) { 
            char[] arr = ("" + count).toCharArray();
            for(char c: arr) chars[++index] = c;
        }
    };
    
    return index + 1 ;
}
```

#### Method 2

```
public int compress(char[] chars) {
        int index = 0, i = 0;
        while(i < chars.length){
            char c = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == c){
                i++;
                count++;
            }
            chars[index++] = c;
            if(count != 1)
                for(char ch : Integer.toString(count).toCharArray()) 
                    chars[index++] = ch;
        }
        return index;
    }
```
