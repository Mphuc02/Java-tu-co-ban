package t40_Cac_dang_ke_thua;

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
		System.out.println("Sot soat");
	}
}
