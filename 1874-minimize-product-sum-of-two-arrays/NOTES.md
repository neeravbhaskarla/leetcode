**Sorting Approach**
​
1. Sort num1 in ascending order and num2 in decending order.
2. Initialize the product sum as 0.
3. Iterate both array and get the cumulative product sum.
​
**Priority Queue (Max Heap)**
​
1. Sort num1 in ascending order.
2. Create a Priority Queue (Max Heap) and add num2 elements one by one.
3. Initalize the product sum as 0.
4. Iterate over array num1. For each element in num1, caluclate its prodcut with the top element of prority queue.
5. Return product sum.
​
**Counting Sort**
​
1. Initalize two arrays counter1 and counter 2 of length 101
2. iterate over nums1, assign occurances of each element, during the iteration in count1.
3. Iterate over nums2, assign occurances of each element, during the iteration in count2.
4. Initialize two pointers p1 and p2, where p1 =0 and p2 = 100, which means p1 iterates for ascending order and p2 iterates in desceding order.
5. caluclate cumulative product of sum of each pair of elements.
6. return that sum.
​