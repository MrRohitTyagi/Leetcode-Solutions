class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        
        s = s.split();
        # print(s)
        r = len(s)
        
        # print(r)
        
        k = len(s[r-1])
        return k;