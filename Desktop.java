// Multiple Inheritance - A class can implements more than one interface.

package week3.day2;

public class Desktop implements Software
{
	
	public void desktopModel()
	{
	System.out.println("Desktop Model");
	}

	public void hardwareResources()
	{
		System.out.println("Hardware Resources");	
	}
	
	public void softwareResources() 
	{
		System.out.println("Software Resources");		
	}
	
	public static void main(String[] args)
	{
		Desktop DS = new Desktop();
		DS.desktopModel();
		DS.hardwareResources();
		DS.softwareResources();
		
	}

	
	
	

}
