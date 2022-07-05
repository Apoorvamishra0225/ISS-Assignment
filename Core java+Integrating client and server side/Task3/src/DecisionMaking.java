import java.util.Scanner;
public class DecisionMaking {

			public static void main(String[] args) {
			      int score;
			      Scanner sc =new Scanner(System.in);
			      System.out.println("Enter Marks out of Hundred");
		    	  score =sc.nextInt();
			      
			      while(true)
			      {
			    	  if(score>=0 && score<=100)
			    	  {
			    		  break;
			    	  }
			    	  else {
			    	      System.out.println("Enter Marks out of Hundred");
			        	  score =sc.nextInt();
			    	  }
			      }
			      String grade = null;
			      switch(score/10) {
			   
			        // for >= 90
			        case 10:
			        case 9:
			           grade = "A";
			           break;
			        // for >= 80 and <90
			        case 8:
			           grade = "B";
			           break;
			        // for >= 70 and <80
			        case 7:
			           grade = "C";
			           break;
			        // for >= 60 and <70
			        case 6:
			           grade = "D";
			           break;
			        // for >= 50 and <60
			        case 5:
			           grade = "E";
			           break;
			        // for < 50
			        default:
			           grade = "F";
			           break;
			      }
			      System.out.println("Result: " + grade);
			}



	}
