package Cac_bai_co_ban;

import javax.management.relation.RelationTypeNotFoundException;

public class t32_Phuong_thuc_get_va_set {
	private int day,
				month,
				year;
	public t32_Phuong_thuc_get_va_set(int d, int m ,int y) 
	{
		if(day>=1 && day<=31)
		{
			day = d;
			
		}
		else 
		{
			day = 1;
		}
		if(month>=1 && month <=12)
			month = m;
		else 
			month = 1;
		if(year>=0)
			year = y;
		else 
		{
			year = 1;
		}
	}
	
    public void setDay(int d)
	{
		day = d;
	}
    public void setMonth(int m)
    {
    	month = m;
    }
    public void setYear(int y)
    {
    	year = y;
    }
    
    public int getDay()
    {
    	return day;
    }
    public int getMonth()
    {
    	return month;
    }
    public int getYear()
    {
    	return year;
    }
    
    //Phuong thuc toString
    @Override
    public String toString()
    {
    	return day + "/" + month + "/" + year;
    }
  
    //Phuong thuc equals 
    
    @Override
    public boolean equals(Object obj)
    {
    	if(this == obj)
    		return true;
    	if(obj == null)
    		return false;
    	if(this.getClass() != obj.getClass())
    		return false;
    	t32_Phuong_thuc_get_va_set other = (t32_Phuong_thuc_get_va_set) obj;
    	if(day != other.day)
    		return false;
    	if(month != other.month)
    		return false;
    	if(year != other.year)
    		return false;
    	return true;
    }
    
    //hascode: ham bam
    @Override
    public int hashCode()
    {
    	final int prime = 31;
    	int result = 1;
    	result = prime * result + day;
    	result = prime * result + month;
    	result = prime * result + year;
    	return result;
    }
}
