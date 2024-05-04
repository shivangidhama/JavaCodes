package recursion;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
boolean[][]  a={
    {true,true,true},
    {true,false,true},
    {true,true,true}
};
obstacle("", a, 0, 0);
    }
    public static int count(int row,int col){
        if(row==1 || col==1)
         return 1;

        int left=count(row-1,col);
        int right=count(row,col-1);

        return left+right;
    }
    public static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
        path(p+'D', r-1, c);

        if(c>1)
        path(p +'R', r, c-1);
    }
    public static ArrayList<String> diagonalPath(String p,int row,int col){
if(row==1 && col==1){
    ArrayList<String> list=new ArrayList<>();
    list.add(p);
    return list;
}
ArrayList<String> list=new ArrayList<>();
if(row>1 && col>1){
    list.addAll(diagonalPath(p+'D', row-1, col-1));
}
if(row>1)
list.addAll(diagonalPath(p+'V', row-1, col));

if(col>1)
list.addAll(diagonalPath(p+'H', row, col-1));

return list;
    }

public static void obstacle(String p,boolean[][] maze,int r ,int c){
if(r==maze.length-1 && c==maze[0].length-1){
    System.out.println(p);
    return;
}
if(!maze[r][c])
return;

if(r<maze.length-1)
obstacle(p+'D', maze, r+1, c);

if(c<maze[0].length-1)
obstacle(p+'R', maze, r, c+1);
}
}
