package Cac_bai_co_ban;


public class t26_Cau_lenh_break_continue_return {
	public static void Lenh_ngat()
	{
		//break
		//Khong co label
		for(int i = 1;i<=10;i++)
		{
			if(i>5)
				break;
		}
		
		//break co label
		xuatNgoai: for(int i = 1;i<=10;i++)
		{
			for(int j = 1;j<=20;j++)
			{
				System.out.print(j);
				if(i>5)
					break xuatNgoai;
					//break se ket thuc vong lap co nhan xuatNgoai-
			}
			System.out.println();	
		}
		
		//continue khong co label
	    for(int i = 1;i<=10;i++)
		{
			for(int j = 1;j<=20;j++)
			{
				System.out.print(j);
				if(i>5)
					continue;
					//break se ket thuc vong lap co nhan xuatNgoai-
			}
			System.out.println();	
		}
	    
	    //conntinue co label
	    benNgoai: for(int i = 1;i<=10;i++)
		{
			for(int j = 1;j<=20;j++)
			{
				System.out.print(j);
				if(i>5)
					continue benNgoai;
					//break se ket thuc vong lap co nhan xuatNgoai-
			}
			System.out.println();	
		}
	}
}
