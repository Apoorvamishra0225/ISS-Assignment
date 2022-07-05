import java.util.Scanner;


public class Area {
	
	public double radius;
	final double PI=3.14;
	public double area;
	Scanner sc=new Scanner(System.in);
	Area(){
		getradius();
		showarea();
	}
	
	public void getradius() {
		System.out.println("Enter the radius");
		radius=sc.nextDouble();
		
	}
	public void showarea() {
		area=PI*radius*radius;
		System.out.println("The area of circle is :"+ area);
		
	}
	
	public static void main(String[] args) { 
         Area a= new Area();
       
	}

}
