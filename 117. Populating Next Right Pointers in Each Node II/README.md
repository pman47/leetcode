# 117. Populating Next Right Pointers in Each Node II

### Medium

---

Given a binary tree

<pre>
    struct Node {
    int val;
    Node *left;
    Node *right;
    Node *next;
    }
</pre>

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.\
Initially, all next pointers are set to NULL.

## Example 1:

<pre>
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
</pre>

## Example 2:

<pre>
Input: root = []
Output: []
</pre>

## Constraints:

- You may only use constant extra space.
- The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.
