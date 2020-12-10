---
layout: post
title:  "5. Abstract / Interface"
date:   2020-12-10 12:26:54 +0100
permalink: 5-oop3.html
---
## Slides
- [Here](https://github.com/jkrude/java-beginner-lesson/blob/master/slides/05-oop3.pdf)

## Exercise

Write a class `Gnirts` that implements the interface CharSequence (it's a default java [interface](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)).
As we already know Strings are just a sequence of characters (`char`) therefore `String` implements CharSequence too.
`Gnirts` constructor gets a `String` as parameter and stores the string in reversed order.
Implement all methods from the interface.
Think about what variables the class needs and what visibility they should have.
*Hint:* Visit the `CharSequence` interface by pressing `Strg + B` on `CharSequence`, there you can read what is meant by each method.
*Notice:* If you create an array like `new char[5];` the array will have 5 slots and therefore the highest index is 4, because we count from 0.
 
 
## Challenge
 - If you want something more complex and have a little exercise for algorithms and data structures:
 - You have given a binary tree structure and want to add all elements from the tree.
 - There is a Visitor-interface that can be implemented, as well as the function `applyVisitor` in `BinaryTree`.
 - If you pass your own `Visitor` to `applyVisitor` your visit method wil be called with every `Node` in the tree.
 - Use `TreeSum` to define your own behaviour:
    - Implement all necessary methods
    - Make `TreeSum` not abstract anymore
    - Test your Implementation with the `main` method from `Test`