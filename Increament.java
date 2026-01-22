public class Increament {
   public static void main(String[] var0) {
      byte var1 = 10;

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         System.out.println("Krish ka gaana sunega!");
      }

      var2 = 19;

      while(true) {
         System.out.println("Hey!");
         if (var2 == 22) {
            do {
               System.out.println("Hi");
            } while(var2 > 30);

            return;
         }

         ++var2;
      }
   }
}
