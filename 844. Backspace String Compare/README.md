# 844. Backspace String Compare

### Easy

---

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.\

Note that after backspacing an empty text, the text will continue empty.

## Example 1:

<pre>
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
</pre>

## Example 2:

<pre>
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
</pre>

## Example 2:

<pre>
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
</pre>

## Constraints:

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.
