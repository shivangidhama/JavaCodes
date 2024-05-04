package recursion;

public class string {
    public static void main(String[] args) {
        System.out.println(skip("abdcah"));
    }
    public static String skip(String up) {
        if(up.isEmpty())
        return " ";

      char  ch=up.charAt(0);
      if(ch=='a')
      return skip(up.substring(1));

      return ch+skip(up.substring(1));
    }
}
