public class Calcupowenr {
    public static int Calcupower1(int x,int n){
     if(n == 0){
        return 1;
      }
      if(x == 0){
        return 0;
      }
      int pownm1 = Calcupower1(x, n-1);
      int xpown =x * pownm1;
      return xpown;
    }

    public static void main(String[] args) {
        int x =2, n=5;
        int ans = Calcupower1(x, n);
        System.out.println(ans);
    }
}
