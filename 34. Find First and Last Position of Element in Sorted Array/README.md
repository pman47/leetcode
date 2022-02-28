# 34. Find First and Last Position of Element in Sorted Array

### Medium

---

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.\

If target is not found in the array, return [-1, -1].\

You must write an algorithm with O(log n) runtime complexity.\

## Example 1:

<pre>
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
</pre>

## Example 2:

<pre>
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
</pre>

## Example 3:

<pre>
Input: nums = [], target = 0
Output: [-1,-1]
</pre>

## Constraints:

- 0 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
- nums is a non-decreasing array.
- -10^9 <= target <= 10^9
