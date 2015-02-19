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

<<<<<<< HEAD
				Clef = Key.trim();				
                                
=======
				String Clef = Key.trim();
			///////////////////////////////////////////////////////////////////////	
            if(Key.toUpperCase().trim() == FIN)			// Why this no work
				{										// Why this no work
					Condition = false;					// Why this no work
				}										// Why this no work
			////////////////////////////////////////////////////////////////////////
>>>>>>> origin/master
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
			System.exit(1);
		}
	}
}