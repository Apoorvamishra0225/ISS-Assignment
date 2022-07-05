
public class TestThrows {

	public int division(int a, int b) throws ArithmeticException{
	      int t = a/b;
	      return t;
	   }
	   public static void main(String args[]){
	      TestThrows obj = new TestThrows();
	      try{
	         System.out.println(obj.division(15,0));
	      }
	      catch(ArithmeticException e){
	         System.out.println("Number cannot be divided by zero");
	      }
	   }

}
