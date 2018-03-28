## [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

## Java Solution

#### Method 1

```
public int romanToInt(String s) {
    if(s.length() == 0) return 0;
    
    Map<Character, Integer> map = new HashMap<Character, Integer>()
    {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
    }};
    
    int result = 0;
    
    for(int i=0; i<s.length(); i++) {
        int a = map.get(s.charAt(i));
        
        if (i+1 < s.length()) {
            int b = map.get(s.charAt(i+1));
        
            if(a>=b) {
                result += a;
            }
            else {
                result += b - a;
                i++;
            }
        }
        else {
            result += a;
        }
    }
            
    return result;
}
```

#### Method 2
```
public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>()
    {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
    }};

    int result = 0;
    
    if(s.length() == 0) return 0;

    if(s.indexOf("IV")!=-1) result -= 2;
    if(s.indexOf("IX")!=-1)	result -= 2;
    if(s.indexOf("XL")!=-1)	result -= 20;
    if(s.indexOf("XC")!=-1)	result -= 20;
    if(s.indexOf("CD")!=-1)	result -= 200;
    if(s.indexOf("CM")!=-1)	result -= 200;

    char arr[] = s.toCharArray();

	for(int i=0; i<s.length(); i++){
	    result += map.get(arr[i]);
	}

   return result;

}

```

#### Method 3

```
public static int romanToInt(String s) {
    int result = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        char c = s.charAt(i);
        switch (c) {
            case 'I':
                result += (result >= 5 ? -1 : 1);
                break;
            case 'V':
                result += 5;
                break;
            case 'X':
                result += 10 * (result >= 50 ? -1 : 1);
                break;
            case 'L':
                result += 50;
                break;
            case 'C':
                result += 100 * (result >= 500 ? -1 : 1);
                break;
            case 'D':
                result += 500;
                break;
            case 'M':
                result += 1000;
                break;
        }
    }
    return result;
}
```
