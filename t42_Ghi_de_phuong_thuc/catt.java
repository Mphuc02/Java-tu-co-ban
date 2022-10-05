package t42_Ghi_de_phuong_thuc;

public class catt extends animal{

	public catt() 
	{
		super("cat");
	}

	@Override
	public void eat() 
	{
		System.out.println("an ca");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("meo meo");
	}
	
}
