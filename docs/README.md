### Exercise 1
| Size / complexity |     log n     |       n       |    n log n    |  n<sup>2</sup>   |  n<sup>3</sup>   |   2<sup>n</sup>  |      n!          |
|-------------------|---------------|---------------|---------------|------------------|------------------|------------------|------------------|
| 1                 | 0             | 1             | 0             | 1                | 1                | 2                | 1
| 10                | 3.322         | 10            | 33.22         | 100              | 1000             | 1024             | 3628800          |
| 100               | 6.643         | 100           | 664.386       | 10000            | 1e6              | 1.3e30           | 9.3e157          |
| 1000              | 9.966         | 1000          | 9966          | 1e6              | 1e9              | 1e301            | 4e2567           |
| 10000             | 13.288        | 10000         | 132877.124    | 1e8              | 1e12             | 1.9e3010         | 2.8e35659        |
| 100000            | 16.609        | 100000        | 1.6e6         | 1e10             | 1e15             | 9.9e30102        | &#x221e;         |
| 1000000           | 19.932        | 1000000       | 1.9e7         | 1e12             | 1e18             | 9.9e301029       | &#x221e;         |

### Exercise 2
| T(n)          | 1 second | 1 minute |  1 hour  |  1 day   |  1 year  |
| --------------|----------|----------|----------|----------|----------|
| log n         | &#x221e; | &#x221e; | &#x221e; | &#x221e; | &#x221e; |
| n             | 1e9      | 6e10     | 3.6e12   | 8.6e13   | 3.1e16   |
| n log n       | 3.9e7    | 1.9e9    | 9.8e10   | 2.1e12   | 6.4e14   |
| n<sup>2</sup> | 31623    | 244949   | 1.8e6    | 9e6      | 1.7e8    |
| n<sup>3</sup> | 1000     | 3914     | 15326    | 44208    | 315938   |
| 2<sup>n</sup> | 29       | 35       | 41       | 46       | 54       |
| n!            | 12       | 13       | 15       | gick ej  | gick ej  |

### Exercise 3
- f4 - f3 - f1 - f5 - f2
- this is true because the function after n=1  will always be smaller than n^3 while c=1.
- this is true because the function after n=1  will always be smaller than n^2 while c=1.
- this is true because we hace a function c1*g(n) for the upper bound when c1=1/2 and n is larger or equals to 0, and a function c2*g(n) for the lower bound when c2=1/4 and n is larger or equals to 2.
- this is true because the function after n=1 will always be larger than n while c=1.

### Exercise 4
- O(n)
- O(n)
- O(n^2)
- O(n^2)
- O(n^4)

### Exercise 5
- because we can compare our function to a function of type c*g(n0) with a specific c value and for all n that are larger than our starter n0, and in our case if we make c= 2 and our n0 to start from 4. this function will always be larger than (n+1)^3 while n is larger than 4. 

### Exercise 6.1
- line 3 and 4 are the basic operations.
- if we sum all posible operations we get the function 2n-n-(n(n-1)/2) which is in O(n^2).

### Exercise 7
- insertion sort has a better best case time complexity with O(n) while selection sort has a best case of O(n^2), that is if the array is sorted or mostly sorted, but selection sort time complexity is not as affected by the the list size as the insertion sort.
- Among both of the sorting algorithm, the insertion sort is fast and effiecent. while selection sort only works efficiently when the small set of elements is involved or the list is partially previously sorted. The number of comparisons made by selection sort is greater than the movements performed whereas in insertion sort the number of times an element is moved or swapped is greater than the comparisons made.
