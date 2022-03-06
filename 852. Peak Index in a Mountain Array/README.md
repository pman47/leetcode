# 852. Peak Index in a Mountain Array

### Easy

---

Let's call an array arr a mountain if the following properties hold:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
- - arr[0] < arr[1] < ... arr[i-1] < arr[i]
- - arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].\

## Example 1:

<pre>
Input: arr = [0,1,0]
Output: 1
</pre>

## Example 2:

<pre>
Input: arr = [0,2,1,0]
Output: 1
</pre>

## Example 3:

<pre>
Input: arr = [0,10,5,2]
Output: 1
</pre>

## Constraints:

- 3 <= arr.length <= 10^4
- 0 <= arr[i] <= 10^6
- arr is guaranteed to be a mountain array.
