public class SetcharAtMethod {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Narayan");
    System.out.println("intial: " + sb);

    sb.setCharAt(5,'R');
    System.out.println("charcter of index 5 " + sb );
}
}
