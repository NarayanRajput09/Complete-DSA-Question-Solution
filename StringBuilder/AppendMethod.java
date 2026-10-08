public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Narayan ");
        System.out.println("initial:  "+ sb);

        sb.append("Rajpoot");
        System.out.println("After append: "+ sb);
    }
}
