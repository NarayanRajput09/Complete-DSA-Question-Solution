// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class younger {
   public younger() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter age of Ram =");
      int ram = sc.nextInt();
      System.out.print("Enter age of Shyam =");
      int shyam = sc.nextInt();
      System.out.print("Enter age of Ajay =");
      int ajay = sc.nextInt();
      if (shyam < ram && shyam < ajay) {
         System.out.print("Ram is youngest.");
      } else if (ajay > shyam && shyam < ajay) {
         System.out.print("Shyam is youngest.");
      } else {
         System.out.print("Ajay is youngest.");
      }

   }
}
