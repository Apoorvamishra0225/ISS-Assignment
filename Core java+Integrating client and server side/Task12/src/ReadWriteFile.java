import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile 
{

	public static void main(String[] args)
	{
		try
		{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\readwrite\\output.txt"));
		bw.write("Apoorva\n");
		bw.write("Mishra\n");
		bw.close();
		}
		
		catch(Exception ex) 
		{
			return;
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("D:\\readwrite\\output.txt"));
			String s;
			
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
			br.close();
	
		}
		catch(Exception e)
		{
			return;
		}
		
	}

}