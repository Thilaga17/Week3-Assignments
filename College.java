package week3.day2;

public class College extends University
{

	@Override
	public void ug()
	{
		System.out.println("UG in college");
	}
	
	public static void main(String[] args) 
	{
		College co = new College();
		co.pg();
		co.ug();
	}

}
