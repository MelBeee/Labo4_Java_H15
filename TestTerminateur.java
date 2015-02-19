// TestTerminateur.java
// 
// Fait par Melissa Boucher et Francis Thibodeau 
// 20 Fevrier 2015
public class TestTerminateur 
{
	Thread t;
	public TestTerminateur()
	{
		Terminateur afficheur = new Terminateur();
		t = new Thread(afficheur);
		t.start();
	}
	
	public void afficherPoint()
	{
		while (t.isAlive())
		{
			try
    		{
    		   System.out.print(".");
    		   Thread.sleep(500);
    		}
    		catch(InterruptedException e)
    		{
    			System.err.println(e);
    			System.exit(1);
    		}
		}
	}
	
	public static void main(String args[])
    {
    	TestTerminateur app = new TestTerminateur();
    	app.afficherPoint();
    }
}