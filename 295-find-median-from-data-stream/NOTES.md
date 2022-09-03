largeHeap is a min heap which pops minimum element in the tree
smallHeap is a max heap which pops maximum element in the tree
​
so, that largeHeap contains only large elements and smallHeap contains only minimum elements.
​
hence if we balance their sizes every time we got the new element.
​
If the given number of elements is even, the largeHeap root contains middle element of sorted second half and the smallHeap root contains the middle element of sorted first half. Then we can find median by doing median by taking peek of largeheap and min heap.
​
If the given number of elements is odd, then we need to find that is largeHeap is larger or smallHeap large, Then we need to get the peek value of the heap having greater size.