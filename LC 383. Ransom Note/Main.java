class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] arr = new int[26];
        int[] arr2 = new int[26]; 
        
        for (int i=0; i<ransomNote.length(); i++) 
            arr[ransomNote.charAt(i)-97]++;
        
        for (int i=0; i<magazine.length(); i++) 
            arr2[magazine.charAt(i)-97]++;
         
        for (int i=0; i<26; i++) 
            if (arr[i] > arr2[i]) 
                return false;
        
        return true;
    }
}