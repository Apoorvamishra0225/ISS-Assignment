import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		Map<Integer,String> mysubjects = new HashMap<Integer,String>();  
		 
        //Add elements to map
        mysubjects.put(1,"Java");  
        mysubjects.put(2,"Spring");  
        mysubjects.put(3,"Oracle");  
 
        //Print map elements in key value form
        for(Map.Entry subject : mysubjects.entrySet()) 
           System.out.println(subject.getKey()+" - "+subject.getValue()); 

	}

}
