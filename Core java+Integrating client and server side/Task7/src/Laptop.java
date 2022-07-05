
public class Laptop implements Comparable<Laptop> {
   String name;
   int ram;
   int price;
   public Laptop(String name, int ram, int price) {
      super();
      this.name = name;
      this.ram = ram;
      this.price = price;
   }
   public String getName() {
      return name;
   }
   public int getRam() {
      return ram;
   }
   public void setRam(int ram) {
      this.ram = ram;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   @Override
   public int compareTo(Laptop o) {
      if (this.ram > o.getRam())
         return 1;
      else {
         return -1;
      }  
   }
}
