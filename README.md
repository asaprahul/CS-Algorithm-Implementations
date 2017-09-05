# CS-Algorithm-Implementations
Implementations of different algorithms in Java

### Sieve of eranthoses (Compute prime numbers till N)
Create a table of numbers from 2 to N. Start from 2 and cross-off all the multiples of 2 in the table. Then move to 3 and follow the same process, starting from 9. 

For x in the table, cross-off multiples of x starting from x^2 to N. (Start from x^2 because 1 to x multiples of x have already been crossed off by x-1, x-2 ... 2)
