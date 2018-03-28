## [Two Sum II - Input Array Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)

Given an array of integers that is already sorted, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. 
Please note that your returned answers (both index1 and index2) are not zero-based.

#### Example

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [1, 2].
```

## Java Solutions

#### O(n) - Using two pointers low and high

```
public int[] twoSum(int[] numbers, int target) {
    int result[] = new int[2];
    int low = 0, high = numbers.length - 1;
    for(int i=0; i<numbers.length; i++) {
        if(numbers[low] + numbers[high] == target) {
            result[0] = low + 1;
            result[1] = high + 1;
            return result;
        }
        else if(numbers[low] + numbers[high] < target) {
            low++;
        }
        else {
            high--;
        }
    }

    return result;
}
```