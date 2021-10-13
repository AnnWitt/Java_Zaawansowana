package z20211009.Instrumenty;

 class Pianino implements Instrumentalny {
     @Override
      public void graj() {
         System.out.println("pianino");
     }

     @Override
     public void test() {
         System.out.println("coś z Ani modyfikacji");
     }
 }
