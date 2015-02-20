// TestTerminateur.java
// 
// Fait par Melissa Boucher et Francis Thibodeau 
// 20 Fevrier 2015
import java.io.*;
public class TestTerminateur 
{
	public void afficherPoint()
	{
		// instance de la class Terminateur 
		Terminateur afficheur = new Terminateur();
		// instance Thread construit avec notre instance de Terminateur
		Thread t = new Thread(afficheur);
		
		System.out.println("Entrez \"Q\" ou \"q\" pour terminer");
		
		// commence le thread et en meme temps commence Run() de Terminateur
		t.start();	
		while (t.isAlive()) // tant et aussi longtemps que le thread est 'vivant'
		{
			try
    		{
				System.out.print("."); // on affiche des points
				Thread.sleep(500); // et on attend 500ms et on recommence si aucune exception n'Est levés
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
    	TestTerminateur app = new TestTerminateur(); // instance de class 
    	app.afficherPoint(); 
    }
}
