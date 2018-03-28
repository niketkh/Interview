## [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/description/)

Given a string containing only digits, restore it by returning all possible valid IP address combinations.

```
For example:
Input:
"25525511135"

Output:
["255.255.11.135", "255.255.111.35"]. (Order does not matter)
```

## Java Solutions

#### Solution using three nested loops to get 4 parts of IP address

```
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int len = s.length();
        
        for(int i=1; i<4 && i<len-2; i++) {
            for(int j=i+1; i<i+4 && j<len-1; j++) {
                for(int k=j+1; k<j+4 && k<len; k++) {
                    String s1 = s.substring(0,i);
                    String s2 = s.substring(i,j);
                    String s3 = s.substring(j,k);
                    String s4 = s.substring(k,len);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        
        return result;
    }
    
    public boolean isValid(String s) {
        if(s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length()>1) || Integer.parseInt(s)>255)
            return  false;
        return true;
    }
}
```

#### Solution using 4 nested loops
```
public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<>();
    int len = s.length();
    
    for(int a=1; a<4; a++) {
        for(int b=1; b<4; b++) {
            for(int c=1; c<4; c++) {
                for(int d=1; d<4; d++) {
                    if(a + b + c + d == len) {
                        int A = Integer.parseInt(s.substring(0, a));
                        int B = Integer.parseInt(s.substring(a, a+b));
                        int C = Integer.parseInt(s.substring(a+b, a+b+c));
                        int D = Integer.parseInt(s.substring(a+b+c));
                        if(A<=255 && B<=255 && C<=255 && D<=255){
                            StringBuilder sb = new StringBuilder();
                            sb.append(A).append(".").append(B).append(".").append(C).append(".").append(D);
                            if(sb.length() == len + 3)
                                result.add(sb.toString());
                        }
                    }
                }
            }
        }
    }
    
    return result;
}
```

#### Solution using 3 nested loops - optimised version of above solution

```
public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<>();
    int len = s.length();
    
    for(int a=1; a<4; a++) {
        for(int b=1; b<4; b++) {
            for(int c=1; c<4; c++) {
                    int d = len - a - b - c;
                    if ( d > 0 && d < 4 && a+b+c+d == s.length()) {
                        int A = Integer.parseInt(s.substring(0, a));
                        int B = Integer.parseInt(s.substring(a, a+b));
                        int C = Integer.parseInt(s.substring(a+b, a+b+c));
                        int D = Integer.parseInt(s.substring(a+b+c));
                        if(A<=255 && B<=255 && C<=255 && D<=255){
                            StringBuilder sb = new StringBuilder();
                            sb.append(A).append(".").append(B).append(".").append(C).append(".").append(D);
                            if(sb.length() == len + 3)
                                result.add(sb.toString());
                        }
                    }
            }
        }
    }
    
    return result;
}
```

#### Solution using DFS