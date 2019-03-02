Meta:
@author Nabil Yusuf
Feature: A robot movement story

Given a 5 by 5 table
When I place the robot at (PLACE 0,0,NORTH)
Then the <command> is given to the robot,it should report at <position>

Examples:
|command    |position   |
|MOVE       |[0,1,NORTH]  |
|LEFT       |[0,0,WEST]   |
