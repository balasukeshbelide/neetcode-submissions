class Solution {
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]=='1') {
                    if(visited[i][j]==false) {
                        count++;
                        bfs(grid, i, j);
                    }
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        int x;
        int y;

        while(!q.isEmpty()) {
            int[] front = q.poll();
            x = front[0];
            y = front[1];
            visited[x][y] = true;
            if(y+1<n && grid[x][y+1]=='1' && visited[x][y+1]==false) {
                visited[x][y+1] = true;
                q.offer(new int[]{x, y+1});
            }
            if(x+1<m && grid[x+1][y]=='1' && visited[x+1][y]==false) {
                visited[x+1][y] = true;
                q.offer(new int[]{x+1, y});
            }
            if(y-1>=0 && grid[x][y-1]=='1' && visited[x][y-1]==false) {
                visited[x][y-1] = true;
                q.offer(new int[]{x, y-1});
            }
            if(x-1>=0 && grid[x-1][y]=='1' && visited[x-1][y]==false) {
                visited[x-1][y] = true;
                q.offer(new int[]{x-1, y});
            }
        }
    }








}
