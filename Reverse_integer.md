# Reverse Integer
Note on [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
## Logic
1. for the input integer n, mod it by 10, take the remainder r
2. multiply the result by 10 (result start from 0), and add r
3. subtract r from n, divide n by 10
4. Check if result is greater or smaller than maximum or minimum integer type allowed value; if yes, return 0
## Key points
1. if n is negative, r is negative as well
2. **Don't declare result as type int at the beginning as a integer overflow later may occur later. Cast the result to type int at the return statement instead**
3. Java has Integer.Max_VALUE and MIN_VALUE constants! Take advantage of that