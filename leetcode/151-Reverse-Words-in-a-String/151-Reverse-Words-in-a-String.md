## [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/description/)

Given an input string, reverse the string word by word.

```
For example,
Given s = "the sky is blue",
return "blue is sky the".
```

## Java Solutions

#### Using [split](https://stackoverflow.com/questions/225337/how-do-i-split-a-string-with-any-whitespace-chars-as-delimiters) method and traversing array from end to start

```
public String reverseWords(String s) {
    String arr[] = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for(int i=arr.length-1; i>=0; i--) {
        sb.append(arr[i] + " ");
    }
    
    return sb.toString().trim();
}
```

#### Without using split(), trim(), StringBuilder
```
public class Solution {
  
    public String reverseWords(String s) {
        if(s == null) return null;
      
        char arr[] = s.toCharArray();
        int n = arr.length;

        // Step 1: Reverse whole string
        reverse(arr, 0, n-1);
        // Step 2: Reverse each word
        reverseWords(arr, n);
        
        // Step 3: Remove any leading and trailing whitespaces
        return cleanSpaces(arr, n);
    }
    
    // Reverse string from i to j
    public void reverse(char arr[], int i, int j) {
        while(i<j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    
    // Reverse each word
    public void reverseWords(char arr[], int n) {
        // To keep track of start and end indices of word
        int i = 0, j = 0;
        
        // Conditions on inner loops important
        while(i<n) {
            while(i < j || i < n && arr[i] == ' ') i++;    // Skip spaces
            while(j < i || j < n &&  arr[j] != ' ') j++;   // Skip non spaces
            reverse(arr, i, j-1);                          // Reverse word
        }
        
    }
    
    // Remove any leading and trailing whitespaces
    public String cleanSpaces(char arr[], int n) {
        // To keep track of new string without spaces and one for traversing string
        int i = 0, j = 0;
        
        while(j<n) {
            while(j < n && arr[j] == ' ') j++;                      // Skip spaces
            while(j < n && arr[j] != ' ') arr[i++] = arr[j++];      // Keep non spaces
            while(j < n && arr[j] == ' ') j++;                      // Skip spaces
            if(j < n) arr[i++] = ' ';                               // Keep only one space
        }
        
        return new String(arr).substring(0, i);
    }
    
}

``` 
