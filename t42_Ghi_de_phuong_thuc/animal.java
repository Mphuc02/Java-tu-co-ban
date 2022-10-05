package t42_Ghi_de_phuong_thuc;

public class animal {
	protected String nameString;

	public animal(String nameString) 
	{
		this.nameString = nameString;
	}

	public String getNameString() 
	{
		return nameString;
	}

	public void setNameString(String nameString) 
	{
		this.nameString = nameString;
	}
	
	public void eat()
	{
		System.out.println("dang an");
	}
	
	public void makeSound()
	{
		System.out.println(".z.z..z.z");
	}
	
	public void sleep()
	{
		System.out.println("kho kho");
	}
}
