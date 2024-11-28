class Solution {
public:
      int row[4] = {-1 , 0 , 1 , 0} ; 
      int col[4] = {0 , 1 , 0 , -1} ; 
    
    int minimumObstacles(vector<vector<int>>& grid) {
        int m = grid.size() , n = grid[0].size() ; 
        vector<vector<int>> ans(m , vector<int> (n , 1e9)) ; 
        queue<pair<int,int>> q ; 
        ans[0][0] = 0 ; 
        q.push({0 , 0}) ; 
        while(! q.empty()) {
           auto node = q.front() ; 
             q.pop() ; 
            int x = node.first , y = node.second ; 
            
            for(int k = 0 ; k < 4 ; k++) {
                int nr = row[k]+x , nc = col[k]+y ; 
            if(isValid(nr , nc , m , n) && ans[nr][nc] > (ans[x][y] + grid[nr][nc]))
                {
                  ans[nr][nc] = ans[x][y] + grid[nr][nc]         ; 
                  q.push({nr , nc}) ; 
                  
                }
            }
            
        }
        return ans[m-1][n-1] ; 
    }
     bool isValid(int x , int y , int m , int n ) {
        return x >= 0 && y >= 0 && x < m && y < n ; 
     
     }
};