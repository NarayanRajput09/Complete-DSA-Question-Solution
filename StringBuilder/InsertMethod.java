public class InsertMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Narayan ");
        System.out.println("Initial: "+ sb);
       
        sb.insert(7,"Rajpoot");
        System.out.println("After insert: " + sb);
    }
}
 