## [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/description/)

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

## Java Soltions

#### Method 1

```
public String intToRoman(int num) {
    StringBuilder sb = new StringBuilder();
    while(num > 0) {
        if(num >= 1000)      { sb.append("M");	num-=1000; 	}
        else if(num >= 900)  { sb.append("CM");	num-=900; 	}
        else if(num >= 500)  { sb.append("D");	num-=500;	}
        else if(num >= 400)  { sb.append("CD");	num-=400; 	}
        else if(num >= 100)  { sb.append("C");	num-=100;  	}
        else if(num >= 90)   { sb.append("XC");	num-=90;  	}
        else if(num >= 50)   { sb.append("L");	num-=50;   	}
        else if(num >= 40)   { sb.append("XL");	num-=40;  	}
        else if(num >= 10)   { sb.append("X");	num-=10;   	}
        else if(num >= 9)    { sb.append("IX");	num-=9;   	}
        else if(num >= 5)    { sb.append("V");	num-=5;    	}
        else if(num >= 4)    { sb.append("IV");	num-=4;   	}
        else if(num >= 1)    { sb.append("I");	num-=1;    	}
    }
    
    return sb.toString();
}
```

#### Method 2 - Cool Solution
```
public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
}
```

#### Method 3 
```
public String intToRoman(int num) {

    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<values.length;i++) {
        while(num >= values[i]) {
            num -= values[i];
            sb.append(roman[i]);
        }
    }
    return sb.toString();
}
```



