- Mini-Max Sum:
	- Time complexity: Iterating through the array to calculate the sum takes 
O(n) time, where n is the size of the input array (arr). The two separate loops to 
find the minimum and maximum values in the array also take O(n) time each, as they 
iterate through the array elements. Overall, the code has two O(n) time complexity 
loops, but they are not nested. So the total time complexity is O(n), where n is 
the size of the input array.
	- Space complexity: The code uses a few variables (Min, Max, Sum, MinNum, MaxNum) 
of primitive data types (long), which occupy constant space. So, the space complexity 
is constant, denoted as O(1). In summary, the time complexity of the code is O(n) 
and the space complexity is O(1).

- Weighted Uniform Strings:
	- Time complexity: The first loop iterates through the characters of the 
input string s. This loop runs in O(n) time complexity, where n is the length of 
the string s. Within the first loop, elements (weights) are added to a HashSet. 
The HashSet weights insertion operation takes O(1) time on average for each insertion. 
However, the total number of insertions depends on the unique weights generated 
from the input string. In the worst case, where all characters in the string are 
distinct, this could take up to O(n) time. The second loop iterates through the 
queries list, which contains m elements, performing a constant-time check (contains) 
for each element in the HashSet. This takes O(m) time, where m represents the number 
of queries present in the queries list. Overall, the time complexity is O(n), where 
n is the length of the input string s. However, in the worst case, the time 
complexity of the code is O(n + m).
	- Space complexity: The HashSet weights stores unique weights generated from 
the input string. n the worst case, where all characters in the string are distinct, 
it could take up to O(n) space. The space occupied by the results list is directly 
proportional to the number of queries, so it's O(m), where m is the number of queries.
Overall, considering the HashSet and the additional space for the results list, the 
space complexity is O(n) in the worst case (for the HashSet) and O(m) for the results 
list, where n is the length of the input string and m is the number of queries. In 
summary, the space complexity is O(n + m) in the worst case scenario.
