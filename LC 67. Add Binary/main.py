class Solution:
    def addBinary(self, a: str, b: str) -> str:
        
        A = int(a,2) #  binary string to number
        B = int(b,2) #
        d = A + B
        return format(d ,"b") # integer to binary string
        