
public class Dog {
	int dogage;
	public void setage(int age) {
		 dogage=age;
	}
	 public void getAge( ) {
	      System.out.println("Dog age is :" + dogage );
	      
	   }

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setage(10);
		dog.getAge();
		
		


	}

}
