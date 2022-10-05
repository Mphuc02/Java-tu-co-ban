package t42_Ghi_de_phuong_thuc;

public class dog extends animal{

	public dog() 
	{
		super("dog");
	}

	@Override
	public void eat() 
	{
		System.out.println("an thit");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("gau gau");	
	}
	
	
}
