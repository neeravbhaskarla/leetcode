**Merge Approach T: O(m+n) S: O(m+n)**
In merge sort approach, we will compare indexes for two sorted arrays and place the lesser element at the newly allocated array and increment the index of the array.
Hence, we will repeat until the whole array is completed and append left over elements from any of the sorted lists to the result array.
​
**Three Pointers Approach T: O(m+n) S: O(1)**
Its follows same principle of merge approach but we will initialize the third pointer at the end of the num1 array where it is filled by n empty spaces.
​
Initilize the pointer r1 at num1 array m-1 position and pointer r2 at num2 array n-1 position and compare num1[r1] and num2[r2] and add the greater element at index w in the num1 array and decrement the pointer of the greater element and decrement the w pointer.
​
Repeat the operation until r1 or r2 becomes -1, until we exhausted the corresponding pointer. At last append the array of the corresponding pointer until the pointer becomes -1.