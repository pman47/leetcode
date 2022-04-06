# 744. Find Smallest Letter Greater Than Target

### Easy

---

Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.\

Note that the letters wrap around.\

- For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

## Example 1:

<pre>
Input: letters = ["c","f","j"], target = "a"
Output: "c"
</pre>

## Example 2:

<pre>
Input: letters = ["c","f","j"], target = "c"
Output: "f"
</pre>

## Example 3:

<pre>
Input: letters = ["c","f","j"], target = "d"
Output: "f"
</pre>

## Constraints:

- 2 <= letters.length <= 1^4
- letters[i] is a lowercase English letter.
- letters is sorted in non-decreasing order.
- letters contains at least two different characters.
- target is a lowercase English letter.
