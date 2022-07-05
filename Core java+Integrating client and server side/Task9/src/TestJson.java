import java.util.ArrayList;  
import java.util.List;  
import org.json.simple.JSONValue;  
public class TestJson{    
public static void main(String args[]){    
  List<Comparable> arr = new ArrayList();  
  arr.add("sonoo");    
  arr.add(new Integer(27));    
  arr.add(new Double(600000));   
  String jsonText = JSONValue.toJSONString(arr);  
  System.out.print(jsonText);  
}}    