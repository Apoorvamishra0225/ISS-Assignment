import java.util.*; 
public class ComparableExample {
   public static void main(String[] args) {
      List<Laptop> laptopList = new ArrayList<>();
      laptopList.add(new Laptop("HCL", 16, 800));
      laptopList.add(new Laptop("Apple", 8, 100));
      laptopList.add(new Laptop("Dell", 4, 600));
      Collections.sort(laptopList);
      for (Laptop lap : laptopList) {
         System.out.println(lap.getRam());
      }
   }
}
