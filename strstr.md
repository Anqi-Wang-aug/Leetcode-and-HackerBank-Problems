# Implement strstr()

## Algorithm
1. check every character
2. if s.charAt(i) match needle.charAt(0)
   1. check if this substring start at s[i] is needle by counting number of char matches;
   2. if all chars match respective chars in needle, return i
3. No such i found, return -1