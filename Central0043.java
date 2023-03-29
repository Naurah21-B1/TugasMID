/* Nama : Naurah Athayah AR
Nim : 13020210043 */

interface A { public void aaa(); }
interface B extends A {
}

class Central0026 implements B {
   public void aaa() {
      System.out.println("aaa");
   }

   public static void main(String arg[]) {
      Central0026 obj = new Central0026();
      System.out.println("main");
      obj.aaa();
   }
}