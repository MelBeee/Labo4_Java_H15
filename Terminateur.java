// Terminateur.java
// 
// Fait par Melissa Boucher et Francis Thibodeau 
// 20 Fevrier 2015
import java.io.*;

public class Terminateur implements Runnable
{
	private static final String FIN = "Q";
	boolean Condition = true;
	
	public void run()
	{
		String Key = null;
		try
		{
			while(Condition)
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ) );
				Key = reader.readLine();

				String Clef = Key.trim();
				
            if(Key.toUpperCase().trim() == FIN)
				{
					Condition = false;
				}
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
			System.exit(1);
		}
	}
}