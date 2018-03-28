## [1. Two Sum Problem](https://leetcode.com/problems/two-sum/description/)

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

#### Example

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## Java Solutions

#### O(n<sup>2</sup>) - Brute Force Solution
```
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    for(int i=0; i<numbers.length; i++) {
        for(int j=i+1; j<numbers.length; j++) {
            if(numbers[i] == target - numbers[j]) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }

    return result;
}
```

#### O(n) - Solution Using HashMap
```
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}
```

## JavaScript Solutions

#### O(n) - Solution using Map
```
var twoSum = function(nums, target) {
    var ret = [];
    var exist = {};
    for(var i = 0; i < nums.length; i++){
        if(typeof(exist[target - nums[i]]) !== 'undefined'){
            ret.push(exist[target - nums[i]]);
            ret.push(i);
        }
        
        exist[nums[i]] = i;
    }
    
    return ret
};
```


