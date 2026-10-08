public class subString {
  
    public static void main(String[] args) {

        String str = "Hello EveryOne This is narayan";
        System.out.println(subString(str));
    }

    public static String subString(String str) {
        String result = "";

        for (int i = 5; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        return result;
    }
}

