package array;

public class oddvalues {
    public static void main(String[] args) {
        int[][] indices={{1,1},{0,0}};
        System.out.println(oddCells(2, 2, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
           int r=arr[i][0];
           int c=arr[i][1];
           for(int j=0;j<m;j++){
              arr[j][c]++;
           }
           for(int j=0;j<n;j++){
            arr[r][j]++;
           }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
