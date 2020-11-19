---
layout: post
title:  "2. Control Structures "
date:   2020-11-17 11:26:54 +0100
permalink: 2-control-structures.html
---
## Slides 
[Here](https://github.com/jkrude/java-begginer-lesson/blob/master/slides/02-control-structures.pdf) you can find the slides for the lesson.

## Exercise

### Task 1
Code a loop that given a number n prints out all divisors.
- try it with a for-loop and with a while-loop
#### Hints
- `x` divides y `if` `x % y == 0`
- use `System.out.printl(<String>)` to print something

### Task 2
[ROT13](https://en.wikipedia.org/wiki/ROT13) is an old encryption method. Every character in the alphabet is shifted 13 places to the right

- for example: *'a'* (first character) would become *'n'*
- In Java every character can be stored as type `char`
  
  - for example: `char a = 'a' // notice the single quote for single characters`
- The computer stores characters internally as numbers
  - If you want to know what character maps to what number you can see the hole [ASCII list](https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/ASCII-Table-wide.svg/1280px-ASCII-Table-wide.svg.png)
  - for example `'a' == 97` try it out with `System.out.printl( (int) 'a' ) // (int) tells the computer to understand 'a' as an integer`

- therefore you can add characters:

  ```java
  int a = 'a';
  int bInt = a + 1;
  char bChar = (char) bInt; // you could also write char bChar = a + 1;
  ```

- `String text = "Text" is just a combination of multiple character // multiple character → double quotes`

- you can get the *i-th* character from a String with `text.charAt(i)`

  - for example:

    ```java
    String s = "Hallo";
    char second = s.charAr(1);
    int secondAsInt = (int) second;
    ```


- finally if you want to know how many character are in a string you can call `s.length()`

Your task is to decode the mysterious text "gbcFarnxl"
