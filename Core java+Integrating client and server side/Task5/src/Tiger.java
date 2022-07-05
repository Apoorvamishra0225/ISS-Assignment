//overriding and polymorphism
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Tiger extends Animal {
   public void move() {
      System.out.println("Tiger can walk and run");
   }




public static void main(String args[]) 
{
      Animal a = new Animal();   
      Animal b = new Tiger();   
      a.move();   
      b.move();   
}
}


