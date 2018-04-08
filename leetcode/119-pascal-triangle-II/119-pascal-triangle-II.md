## 119. Pascal's Triangle II


## Java Solution

### Using Binomial Coefficients and C(n, r) = C(n, n-r)

```
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        if(rowIndex < 0) return row;
        
        if(rowIndex == 0) {
            row.add(1);
            return row;
        }
        
        row.add(1);
        for(int i=1; i<rowIndex; i++) {
            row.add((int)binomialCoeff(rowIndex, i));
        }
        row.add(1);
        
        return row;
    }
    
    public long binomialCoeff(int n, int r) {
        long binomial = 1;
        
        if(r > n-r) r = n-r;
        
        for(int i=0; i<r; i++) {
            binomial *= (n-i);
            binomial /= (i+1);
        }
        
        return binomial;
    }

}
```

### Using Dynamic Programming
```
public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    if(rowIndex < 0) return row;
    
    row.add(1);
    for(int i=1; i<=rowIndex; i++) {
        for(int j=i-1; j>0; j--) {
            row.set(j, (row.get(j-1) + row.get(j)));
        }
        row.add(1);
    }
    
    return row;
}
```

### Using Dynamic Programming without using `set() of ArrayList`
```
public List<Integer> getRow(int rowIndex) {
      Integer[] row =  new Integer[rowIndex + 1];
      Arrays.fill(row, 0);
      row[0] = 1;
      for(int i = 1; i < rowIndex + 1; i++)
        for(int j = i; j >= 1; j--)
          row[j] += row[j - 1];
      return Arrays.asList(row);
}
```
