## 118. Pascal's Traingle
Given numRows, generate the first numRows of Pascal's triangle.

```
Input: numRows = 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

## Java Solution

### Using factorials [Incorrect Answer for n > 20]
`C(n, r) = n! / ((n-r)! * r!) `

```
class Solution {
    List<Long> factorials = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        
        factorial(numRows-1);
        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) row.add(1);
                else row.add((int)(factorials.get(i)/(factorials.get(j) * factorials.get(i-j))));
                System.out.print(i + "C" + j + " ");
            }
            System.out.println();
            list.add(row);
        }
        
        return list;
    }
    
    public void factorial(int n) {
        long fact = 1;
        factorials.add(fact);
        for(int i=1; i<=n; i++) {
            fact*=i;
            factorials.add(fact);
        }
    }
}
```


### Using C(n,r) = C(n, n-r) 

```
class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        
        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) row.add(1);
                else row.add(binomialCoeff(i, j));
            }
            list.add(row);
        }
        
        return list;
    }
    
    // Using the fact C(n, r) = C(n, n-r)
    public int binomialCoeff(int n, int r) {
        int binomial = 1;
        
        if(r > n-r) r = n-r;
        
        for(int i=0; i<r; i++) {
            binomial *= (n - i);
            binomial /= (i + 1);
        }
        
        return binomial;
    }
}
```

### Using Dynamic Programming using values of previous row

```
public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    if(numRows == 0) return list;
    
    //  First row is always [1]
    list.add(new ArrayList(){{
        add(1);
    }});
    
    for(int i=1; i<numRows; i++) {
        List<Integer> row = new ArrayList<>();
        List<Integer> prevRow = list.get(i-1);
        // First element of row is always 1
        row.add(1);
        
        // Each row element (other than the first and last of each row)
        // is equal to the sum of the elements above-and-to-the-left and
        // above-and-to-the-right
        for(int j=1; j<i; j++) {
            row.add(prevRow.get(j-1) + prevRow.get(j));
        }
        
        // Last element of row is always 1
        row.add(1);
        
        list.add(row);
    }
    
    return list;
}
```
