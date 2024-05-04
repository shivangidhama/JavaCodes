package array;



/**
 * Plusone
 */
public class Plusone {

    public static void main(String[] args) {
        int[] digit = {9,8,7,6,5,4,3,2,1,0};
        int n = 0;
        for (int i = 0; i < digit.length; i++) {
            n = n * 10 + digit[i];
        }
        System.out.println(n);
        int newn = n + 1;
        int len = Integer.toString(newn).length();
        int[] ans = new int[len];
        int j = 0;
        while (newn != 0) {
            ans[len - j - 1] = newn % 10;
            newn = newn / 10;
            j++;
        }
        //for (int a = 0; a < ans.length; a++) {
          //  System.out.print(ans[a]+" ");
        //}
    }
}