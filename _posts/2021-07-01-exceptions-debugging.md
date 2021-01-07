---
layout: post
title:  "7. Exceptions and debugging "
date:   2021-07-01 11:26:54 +0100
permalink: 7-exceptions-debugging.html
---
## Slides
[Here](https://github.com/jkrude/java-begginer-lesson/blob/master/slides/07-exceptions.pdf) you can find the slides for the lesson.

Debugging will be quite important if you start to develop bigger applications.
We focus on debugging with intellij because it is the de facto standard, but debugging with any other ide will be similar.
We didn't mention `finally` because it is rarely used. You can read about [here](https://beginnersbook.com/2013/04/java-finally-block/) or read about in the slides.

## Exercise
> Have a look in the slides for some information about unit-tests.
> We will cover this topic specifically in a later lesson.

Try to find the [mistakes](https://github.com/jkrude/java-beginner-lesson/blob/master/src/lesson7/exercise/DebugMe.java) in all three test-cases.
The difficulty increases with each test case.
##### multiplyTest
In this method a multiplication should be performed without the use of *.
Therefore, mulHelper is recursively called (b times) and should add a b times to 0.
> You can learn more about recursive functions [here](https://www.programiz.com/java-programming/recursion).
> The ternary operator can look very sexy. Learn more about it [here](https://www.tutorialspoint.com/Java-Ternary-Operator-Examples).

##### reverseMultiplyByLengthTest
This method should take a String multiply it as often as the initial length and reverse each copy.
Watch out the method will not terminate initially.
There are two mistakes.

##### testClass
Quite a lot gone wrong in this case.
`callFoo(X X)` and `callFoo(XX x)` are correct, but there are several mistakes made in the class definitions.
 Try to figure out what happens in the first place by stepping threw each method.
 Hint: XX::foo was intended to overwrite X:foo.