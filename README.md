# 1DPathVerifier
A program that verifies if a path can be crossed from one point to the other. 
The path is represented as 1D array where 0 is the part of the road that can 
be used to move, and 1 is a part of the road that can't be used.
Also, a leap is specified which represents the amount of spaces we can jump
(always moving forward only) to try and reach the other end of the path.

Objective:
Given an array containing 0s and 1s, being 0s spaces that can be used to move
around the array, and 1s spaces that can't be used as part of the road, we need
to verify whether the road is *crossable* or not.

Input:
First line specifies the amount of paths we are going to provide for the program
to examine.
The next pair of lines that come next will contain the following information:
n l
path

Being n the lenght of the path, l the leap that can be used to jump forward
only, and path being 0s and 1s separated by spaces.

Output:
Print YES or NO depending on whether the path is crossable or not, for each path
processed
