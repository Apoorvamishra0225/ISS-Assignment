import java.util.*; 
public class TestList {

	public static void main(String[] args) {
		 //Create List object
        List<String> mySubjects = new ArrayList<>();  
 
        //Add elements to list
        mySubjects.add("Java");  
        mySubjects.add("Spring");  
        mySubjects.add("Python");  
 
 
        //Add elements at specified position
        mySubjects.add(1,"SQL");  
        mySubjects.add(2,"Oracle"); 
 
        System.out.println("My Subjects:"); 
        //Print all subjects
        for(String subject : mySubjects){  
         System.out.println(subject);  
        }
 
        //Print element on 2nd index
        System.out.println("Element at 2nd index: "+mySubjects.get(2)); 

	}

}
