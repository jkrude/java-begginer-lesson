# Playground

- Welcome to the java(fx) playground area.
- You can play around and get some direct visual feedback.
- `Javafx` is a library of functionality but should automatically be downloaded by Intellij(maven).

- Everything around could seem a bit overwhelming, don't worry:
  - The places you need to edit are marked with a **TODO**
- Classes that can be executed are marked with a small green arrow
- Start one of the programs from the small green arrow next to the class declaration
    - If you already started one before click `shift+f10` to start it again
    - In the upper right area a green arrow can be found too
    - More on executing a java application within IntelliJ can be found [here](https://www.jetbrains.com/help/idea/running-applications.html)
- As always if there are any questions write us an *email*, create an *Issue* [here](https://github.com/jkrude/java-beginner-lesson/issues/new), or ask us in the next lesson directly


## What to do


#### Plots

- this module visualises functions

- you can experience the difference between integer and floating-point-numbers

- **TODO** Edit `plots/EditMe`

  - both methods can be understood like any other mathematical function *f(x)* or *g(x)*

  - you could try easier functions like *y = x * x*

  - but you can use control-structures as well:

    ```java
    if(x < 0){
        return -1
    }else{
        return 1;
    }
    ```

  - if you want something more difficult try to print the sequence of Fibonacci numbers

- **Extra:**

  - `Axes` is really boring
  - `FunctionPlotter` is the main method → press on the green arrow to run the application
    - At the start are some parameters which you can change and see what happens
  - `MultiPlot` is responsible for creating the plot and calls your method
    - There is a good example for `while-loops`



#### John

- This module includes a really simple game
- I will develop it further, including more programming-paradigm
- The goal is to bring John safely to the cookie.
  - For this you will have to test if your next position collides with one of the obstacles.
- **TODO** Edit `john/Game/editMe`
  - This method will be called approximately 60 times a second
  - Here you can change the position of John.
  - John's position is determined by an X and Y variable.
  - With `xInc` and `yInc` you can change the position of each variable.
  - At the end of the function `moveJohn(xInc, yInc)` should be called.
  - *Notice:* In computer-visualisation it is common that the upper left corner is *(0,0)* and "going left" would increment *X* while "going down" *Y* will get bigger.
- **Extra:**
  - `Game` is responsible for the main game-logic and updating the visuals.
    - The `AnimationTimer gameLoop` calls your method once started.
  - `John` should be called Player but whatever.  The class represents the smiley face.
  - `JohnGame` is the entry-point for the game.
    - You can start the game with the green arrow right of the class declaration.



## Help

- IntelliJ + Maven will do most of the configuration.
- If all Files are shown as fileName*.java* rightclick on `src` → `Mark DIrectory as` → `Sources Root`
- You may have to right click on `pom.xml` → `Add as maven project`
- As allays you can set the *SDK* from the small folder symbol in the upper right ( or *Strg+Alt+Shift+ S*)



## Switching between the branches

- The playground-area is hosted on a separate git-branch
- you can **switch branches** from the command line or with IntelliJ
  - Click on the Tab `9: Git` (or press *Alt + 9*)
  - Click on the (upper) Tab `Log`
  - Click on `Remote`
  - Right click on the branch to which you want to switch
    - Select `Checkout`
  - Find out more [here](https://www.jetbrains.com/help/idea/manage-branches.html#checkout-Git-branch)
- If you **changed on of the branches:**
  - Click on the Tab `9: Git` (or press *Alt + 9*)
  - Click on the (upper) Tab `Local Changes`
  - Click on the small blue downwards arrow on the left side: `Shelve Silently` (or press *Ctr + Shift + H*)
  - If you want to unshelf your changes go to `9: Git` → `Shelf` → small blue upwards arrow on the left: Unshelve silently 
  - Find out more [here](https://www.jetbrains.com/help/idea/shelving-and-unshelving-changes.html)

