//inheritance
	class Inheritence {
	void eat(){
		System.out.println("eating...");
		}
}
	class Dog extends Inheritence{  
	void bark(){
		
	System.out.println("barking...");
	}  
	}  
	class Cat extends Dog{  
	void weep(){
		System.out.println("weeping...");
		}  

	public static void main(String[] args) {
		
		Cat c=new Cat();  
		c.weep();  
		c.bark();  
		c.eat();  
	}
	}

	
