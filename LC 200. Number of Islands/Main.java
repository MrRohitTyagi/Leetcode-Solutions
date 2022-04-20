class Solution {
    static int [][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    
    public void MakeZero(char[][] grid,int i , int j){
        
        grid[i][j] = '0';
        
        for(int [] d : dir){
            
            int a = i + d[0];
            int b = j + d[1];
            
            if(a >= 0 &&  a < grid.length && b >= 0 && b < grid[0].length && grid[a][b] == '1' ){
                MakeZero(grid,a,b);
            }
            
        }
        
       
        
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0 ;
        
        
        for(int i = 0 ;i < n ; i++ ){
            for(int j = 0 ; j < m ; j++ ){
                if(grid[i][j] == '1'){
                    ans++;
                    MakeZero(grid,i,j);    
                }
                
            }//for
        }//for
        return ans;
    }
}