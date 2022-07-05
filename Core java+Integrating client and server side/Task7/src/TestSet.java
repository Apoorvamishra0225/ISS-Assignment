import java.util.*; 
public class TestSet {

	public static void main(String[] args) {
		//Create Set object
        Set<String> mySubjects = new HashSet<>();  
 
        //Add elements to Set
        mySubjects.add("Java");  
        mySubjects.add("Spring");  
        mySubjects.add("Python");  
 
        System.out.println("My Subjects:"); 
        //Print all subjects
        for(String subject : mySubjects){  
         System.out.println(subject);  
        }

	}

}
