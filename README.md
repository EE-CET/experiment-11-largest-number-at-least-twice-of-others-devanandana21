[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/VvQ4XgTR)
# Experiment 11: Largest Number at Least Twice of Others

## Problem Statement

You are given an integer array `nums` of size $n$ where the largest integer is unique. Your task is to determine whether the largest element in the array is at least **twice** as much as every other number in the array.

If it is, print the **index** of the largest element. Otherwise, print `-1`.

## Input Format

* The first line contains the integer $n$ (length of the array).
* The next line contains $n$ space-separated integers.

## Output Format

Print the index of the element if it satisfies the condition, else print -1.

### Example 1

**Input:**

```text
4
3 6 1 0
```

**Output:**

```text
1
```

**Explanation:**
6 is the largest integer. For every other number $x$ in the array:
* 6 is at least twice as big as 3 ($6 \ge 6$)
* 6 is at least twice as big as 1 ($6 \ge 2$)
* 6 is at least twice as big as 0 ($6 \ge 0$)
The index of 6 is 1.

### Example 2

**Input:**

```text
4
1 2 3 4
```

**Output:**

```text
-1
```

**Explanation:**
4 is the largest element. However, 4 is not at least twice as big as 3 ($4 < 6$). Therefore, we print -1.
