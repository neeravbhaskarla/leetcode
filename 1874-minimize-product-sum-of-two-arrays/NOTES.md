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
5. return product sum