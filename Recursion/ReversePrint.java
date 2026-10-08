public class ReversePrint {
       public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n<1){
            return;
        }else{
            
            print( n-1);
            System.out.println(n);
        }
    }
    }

