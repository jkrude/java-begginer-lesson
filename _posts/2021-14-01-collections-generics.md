---
layout: post
title:  "8. Collections and generics "
date:   2021-01-10 11:26:54 +0100
permalink: 8-collections-generics.html
---

## Slides
- [Here](https://github.com/jkrude/java-begginer-lesson/blob/master/slides/08-collections-generics.pdf) you can find the slides for the lesson.


#### Generics
 - Generics are already quite advanced, but are necessary to understand collections.
 - Be aware that `List<Integer>` will be erased to `List`.
    - Therefore: `void foo(List<Integer> ls) and void foo(List<String> ls)` will have the same method-signature!
    - Read more about type-erasure [here](https://www.geeksforgeeks.org/type-erasure-java/)
 
 - You can use `List` without specifying the type, but it should be avoided.
    - If you don`t specify the type there cant be a compile type check!
    - You can still only use one type in your list, but don`t know witch one
 - If you want to dig a bit deeper:
    - bounded generics (`T super ...` or `T extends ...`) [here](https://www.geeksforgeeks.org/bounded-types-generics-java/) and [here](https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html)
    - wildcards (`List<? extends Integer>`) [here](https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html)

#### Collections
- Collections are super useful to structure your data.
- As usual collections have a [hierarchy](https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Java.util.Collection_hierarchy.svg/1200px-Java.util.Collection_hierarchy.svg.png) of interfaces and classes.
    - This is a good example for the use of interfaces / classes.
        - The generic description what a list should do is captured in an interface.
        - The concrete implementation (ArrayList, LinkedList etc.) are classes.
- Be aware of the pro and cons of the individual data-structures.
- [Here](http://www.sergiy.ca/guide-to-selecting-appropriate-map-collection-in-java/) is a great flow-chart to find the right one.
    - Lists:
        - The order is important.
        - Search operations based on the index.
        - Allow duplicates:
    - Sets:
        - No duplicates (*same hash-value for HashSet*)
        - Faster lookup times than lists
    - Maps:
        - key : value mapping with unique keys
        - fastest lookup
        - unique keys

###### Additional information
- When you have gained some experience you can look at the different implementations and compare them to use more fitting solutions.
- The `Stack` class is wildly [criticised](https://stackoverflow.com/questions/2922257/what-are-the-negative-aspects-of-java-class-stack-inheriting-from-vector) and is mostly replaced by `ArrayDeque`
- Since Java 9 there are quick ways to create Sets or Lists with `List.of(...)` or `Set.of(...)` but be aware those are **immutable**.
  
  
  ## Exercise
  - The main task is a quick interactive way to compute the sum of a given list.
    - You will learn a more elegant way in a future lesson.
    - It might animate you to some programs that may directly ease you day to day work.
  - `numberOfDuplicates` aims at a quick way to count duplicates in a list.
  - `countOccurences` is a really simple example for the use of maps.
    - You could use such a function to generate beautiful [word-clouds](https://en.wikipedia.org/wiki/Tag_cloud#/media/File:Foundation-l_word_cloud_without_headers_and_quotes.png).
  - However, the best practise will be your own projects, learning by doing. 
