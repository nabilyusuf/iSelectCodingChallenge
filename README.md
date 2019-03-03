# iSelect-Coding-Challenge
Solution to the iSelect code challenge

## Table of contents:

* [Description](./README.md#description)
  * [Constraints](./README.md#constraints)
  * [Example Input and Output](./README.md#example-input-and-output)
  * [Deliverables](./README.md#deliverables)
* [Setup](./README.md#setup)
* [Running the app](./README.md#running-the-app)
* [Running the tests](./README.md#running-the-tests)
* [Considerations about the development](./README.md#considerations-about-the-development)

## Description

* Code for simulating of a robot movement on a square table top, of dimensions 5 units x 5 units. There are no other obstructions on the table surface. The robot is free to roam around the surface of the table, but must be prevented from falling to destruction.

### Constraints

* Robot will not fall off the table during movement including the initial placement.
  
* Any move that would cause the robot to fall is ignored.

### Example Input and Output:

#### Example 1
        Input:
        PLACE 0,0,NORTH 
        MOVE
        REPORT
        
        Output: 
        0,1,NORTH 

#### Example 2
        Input:
        PLACE 0,0,NORTH 
        LEFT
        REPORT
        
        Output: 
        0,0,WEST
#### Example 2
        Input:
        PLACE 1,2,EAST 
        MOVE
        MOVE
        LEFT
        MOVE
        REPORT
        Output: 
        3,3,NORTH }

### Deliverables

Source code, and any test code/data used in developing the solution.

## Setup

1. Make sure you have JRE 8 installed on your machine. If you need help installing , take a look at the [installation guide](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html).

2. Clone this repo:

    ```git clone git@github.com:nabilyusuf/iSelectCodingChallenge.git```

3. Change to the src directory:

    ```cd iSelectCodingChallenge```

4. Compile:

    ```mvn compile```

4. Test: the test reports will be in the ```target/jbehave```

    ```mvn test```        

And you're ready to go!

### Running the app:
     mvn exec:java    

### Running the tests:
 ```mvn test```
 
* The test reports will be in the ```target/jbehave``` directory

### Considerations about the development:

* Since a robot that receives and executes commands, it made perfect sense to use the Command Pattern to implement it.
  
* The table is passed along to the commands when needed, and it's responsible for checking if a position is valid or not.