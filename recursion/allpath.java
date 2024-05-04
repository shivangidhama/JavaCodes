package recursion;

import java.util.Arrays;

public class allpath {
 
    public static void main(String[] args) {
        boolean[][]  board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path =new int[board.length][board[0].length];
        allpathprint("", board, 0, 0,path,1);
    }
    public static void mazepath(String p,boolean[][] maze,int r ,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        return;
        
        maze[r][c]=false;
        if(r<maze.length-1)
        mazepath(p+'D', maze, r+1, c);
        
        if(c<maze[0].length-1)
        mazepath(p+'R', maze, r, c+1);

        if(r>0)
        mazepath(p+'U',maze,r-1,c);

        if(c>0)
        mazepath(p+'L', maze, r, c-1);

        maze[r][c]=true;
        }

        public static void allpathprint(String p,boolean [][]maze,int row,int col,int[][] path,int step){
            if(row==maze.length-1 && col==maze[0].length-1){
                path[row][col]=step;
                for(int[] arr:path){
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(p);
                System.out.println();
                return;
            }
            if(!maze[row][col])
            return;
            
            maze[row][col]=false;
            path[row][col]=step;
            if(row<maze.length-1)
            allpathprint(p+'D', maze, row+1, col,path,step+1);
            
            if(col<maze[0].length-1)
            allpathprint(p+'R', maze, row, col+1,path,step+1);
    
            if(row>0)
            allpathprint(p+'U',maze,row-1,col,path,step+1);
    
            if(col>0)
            allpathprint(p+'L', maze, row, col-1,path,step+1);
    
            maze[row][col]=true;
            path[row][col]=0;
        }
}
