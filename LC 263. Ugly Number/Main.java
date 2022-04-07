public boolean isUgly(int n) {
        
    if(n <= 0)
        return false;
    
    int[] givenPrimes = {2, 3, 5};
    
    for(int num : givenPrimes){
        while(n % num == 0){
            n = n / num;
        }
    }
    
    return n == 1;
}