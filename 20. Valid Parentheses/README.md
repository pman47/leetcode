# 20. Valid Parentheses

### Easy

---

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.\

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

## Example 1:

<pre>
Input: s = "()"
Output: true
</pre>

## Example 2:

<pre>
Input: s = "()[]{}"
Output: true
</pre>

## Example 3:

<pre>
Input: s = "(]"
Output: false
</pre>

## Constraints:

- 1 <= s.length <= 10^4
- s consists of parentheses only '()[]{}'.
