public class ThreeNum {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int num3 = 20;

        if(num1<num2){
            if(num1<num3){
                System.out.println("num1" +num1);
            }else{
                System.out.println("num3"+num3);
            }
          }  else if(num3<num2){
            System.out.println("num2"+num2);
          }else{
            System.out.println("num3" +num3);
          }
        }
    }

