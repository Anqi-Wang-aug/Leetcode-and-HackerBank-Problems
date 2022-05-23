class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while(i<haystack.length())
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int j = 1;
                while(j<needle.length() && (i+j)<haystack.length() && haystack.charAt(i+j)==needle.charAt(j)) j++;
                if(j==needle.length()) return i;
            }
            i++;
        }
        return -1;
    }
}