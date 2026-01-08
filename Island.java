class Island {
    public int numIslands(char[][] grid) {
        int count=0;
        int r=grid.length,c=grid[0].length;
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;i++){
                if(grid[i][j]=='1'&&mat[i][j]==0){
                    count++;
                    makevisit(mat,grid, i,j,r,c);
                }
            }
        }
        return count;
    }

    public void makevisit(int[][]mat,char[][]grid,int i,int j,int r,int c){
        int[]row={0,-1,0,1};
        int[]col={-1,0,1,0};
        mat[i][j]=1;

        for(int ini=0;ini<4;ini++){

            int ar=i+row[ini];
            int ac=j+col[ini];
            if(ar>=0&&ar<r&&ac>=0&&ac<c&&mat[i][j]==0&&grid[ar][ac]=='1'){
                makevisit(mat,grid,ar,ac,r,c);
            }

        }
    }
}