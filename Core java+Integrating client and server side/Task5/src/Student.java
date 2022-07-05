//encapsulation
public class Student {
	
	  private int rollno;
	  private String name;
	  private int marks;

	  		public String getname() {
			    return  name;
		  }

		  public void setname(String name)
		  {
			  this.name=name;
		  }
		  public int getrollno() {
			    return  rollno ;
		  }
		
		  public void setrollno(int rollno) {
			    this.rollno = rollno;
		  }
		  public int getmarks() {
			    return  rollno ;
		  }
		
		  public void setmarks(int marks) {
			    this.marks = marks;
		  }


	public static void main(String[] args) {
	    Student stud = new Student();

	    stud.setrollno(20);
	    stud.setname("Apoorva");
	    stud.setmarks(95);
	    System.out.println(" Student Details :\n " + " Roll no : "+stud.getrollno() +"\nName : "+stud.getname()+"\nMarks : "+stud.getmarks());

	}

}
