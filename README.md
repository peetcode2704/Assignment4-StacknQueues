# Assignment 4 – Stacks and Queues

**Deadline:** Friday, February 28, 2025, 9:59 pm  

## Objectives:
- Familiarize yourself with the Stack and Queue data structures. **Use ONLY Stacks and Queues** for this assignment.

## Instructions:
- **(code):** Write a Java program for the instructor to run.
- **(text):** Provide an answer (prose, algorithm, pseudo-code, or equations).

## Problems:
### 1. Stacking (Text) – 10 points
Given an empty stack, determine the contents after these operations:
- push(8)
- push(2)
- pop()
- push(pop()*2)
- push(10)
- push(pop()/2)

### 2. Queueing (Text) – 10 points
Given an empty queue, determine the contents after these operations:
- push(4)
- push(pop()+4)
- push(8)
- push(pop()/2)
- pop()
- pop()

### 3. Find in Deque (Text) – 10 points
Provide an algorithm to find the position of element `x` in a deque `q` in **O(n)** time.

### 4. Balanced Brackets (Code) – 25 points
Write a function `isBalanced(String s): String` to return "YES" if a bracket sequence is balanced and "NO" otherwise. Only use a stack (LinkedList with `add()`, `remove()`, `peek()` methods).

**Sample Inputs & Outputs:**
- `{[()]}` → "YES"
- `{[(])}` → "NO"
- `{{[[(())]]}}` → "YES"

### 5. Decode String (Code) – 25 points
Write a function to decode a string using the pattern `k[encoded_string]`.

**Example Inputs & Outputs:**
- `3[a]2[bc]` → `aaabcbc`
- `3[a2[c]]` → `accaccacc`
- `2[abc]3[cd]ef` → `abcabccdcdcdef`

### 6. Infix to Postfix (Code) – 10 points
Convert an infix expression to a postfix expression using a stack.

**Example:**
- Input: `a+b*(c^d-e)^(f+g*h)-i`
- Output: `abcd^e-fgh*+^*+i-`

### 7. Algorithm Analysis (Text) – 10 points
Explain the **time and space complexity** of your solutions for Problems 4–6 using Big-O notation.
## Author

**Peter Hoang**\
Course: [Data Structures and Algorithms CSC-3130-02]\

Feel free to contribute or suggest improvements!

