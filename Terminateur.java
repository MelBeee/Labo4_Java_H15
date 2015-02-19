// Terminateur.java
// 
// Fait par Melissa Boucher et Francis Thibodeau 
// 20 Fevrier 2015
import java.io.*;

public class Terminateur implements Runnable
{
	
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ) );
	String Clef;

	public void run()
	{
		String Key = null;
		try
		{
			while(!Clef.toUpperCase().equals("Q"))
			{
				
				Key = reader.readLine();

				Clef = Key.trim();				
                                
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
			System.exit(1);
		}
	}
}