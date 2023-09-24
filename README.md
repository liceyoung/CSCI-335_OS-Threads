Suppose a is a three dimensional integer array:

a. Regenerate code and discuss the temporal locality of given code.\
b. Regenerate amd discuss the spatial locality of given code.<br> 
c. Which nested loop has better performance? Why?
_____________________
ANSWER: <br> 
a. Temporal locality can be defined as the tendency for a memory location, once referenced, to have a high probability of being referenced again in the near future.<br>    

By Geekforgeeks, “Temporal Locality means that a instruction which is recently executed has high chances of execution again. So the instruction is kept in cache memory such that it can be fetched easily and takes no time in searching for the same instruction.”

->  Since all of the methods from 1 to  6 only access each memory location once, the temporal locality of all methods are the same.<br> 

b. The definition of spatially locality is that when a memory location is accessed, there is a strong probability of accessing nearby memory locations in the future.

By Geekforgeeks, Spatial Locality means that all those instructions which are stored nearby to the recently executed instruction have high chances of execution. It refers to the use of data elements(instructions) which are relatively close in storage locations.  

-> Even six methods access each memory once, the 3-d array stored in the memory benefits method 3 in referencing the memory location near it. Method 5, on the other hand, has to always ’jump’ very far away from the memory location which is currently referenced. Therefore, if the same memory location is referenced as we run six methods, the third method is better at utilizing its spatially locality.<br> 

c. The nested loop has better performance: method 3 (loop 3)
This is because they all have the same temporal locality but the third method is better in utilizing the spatially locality.

Here is running time of 6 loop (6 methods):
Method 1- Loop 1: 985.0<br> 
Method 2-Loop 2: 1059.0<br> 
Method 3-Loop 3: 521.0<br> 
Method 4-Loop 4: 1315.0<br> 
Method 5-Loop 5: 3807.0<br> 
Method 6-Loop 6: 3314.0
