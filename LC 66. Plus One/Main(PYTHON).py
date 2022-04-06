class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        L =[]
        y =' '
        
        for i in digits:
            y = y + str(i)
            
        y = str(int(y) + 1)   
        
        for ele in y:
            L.append(int(ele))
            
        return L
        