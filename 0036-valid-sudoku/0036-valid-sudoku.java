class Solution {
    public boolean isValidSudoku(char[][] board) {
     boolean[][] rows=new boolean[9][9],columns=new boolean[9][9];
     boolean[] block9=new boolean[9];
     /*for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.')
            continue;
            else{
                int num=board[i][j]-49;
                if(rows[i][num]==true||columns[j][num]==true)
                return false;
                else 
                {
                    rows[i][num]=true;
                    columns[j][num]=true;
                }
            }
        }
        
     }*/

     for(int m=0;m<3;m++){
        int istart=m*3,iend=istart+3;
        for(int n=0;n<3;n++){
            int jstart=n*3,jend=jstart+3;
            for(int i=istart;i<iend;i++){
                for(int j=jstart;j<jend;j++){
                    if(board[i][j]=='.')
                    continue;
                    else
                    {
                        int num=board[i][j]-49;
                    if(block9[num]||columns[j][num]||rows[i][num])
                    return false;
                    else{
                    block9[num]=true;
                    columns[j][num]=true;
                    rows[i][num]=true;
                    }}
                }
            }
            block9=new boolean[9];
        }
     }
     return true;
        
    }
}