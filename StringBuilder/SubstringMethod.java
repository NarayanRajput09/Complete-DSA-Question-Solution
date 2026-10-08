public class SubstringMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Narayan");
        System.out.println("initial:"+sb);
        String sub = sb.substring(0,5);
        System.out.println("substring(0-5): "+ sub);
    }
}
