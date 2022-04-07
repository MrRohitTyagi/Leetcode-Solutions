class Solution:
    def isPalindrome(self, st: str) -> bool:
        
        st.strip()
        st = st.lower()
        st = ''.join(ch for ch in st if ch.isalnum())
        print(st)
        for i in range(0, int(len(st)/2)):
            if st[i] != st[len(st)-i-1]:
                return False
        return True