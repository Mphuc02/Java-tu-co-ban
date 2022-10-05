package t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DS_SV 
{
	private ArrayList<sinhVien> ds_sv = new ArrayList<sinhVien>();

	public DS_SV(ArrayList<sinhVien> ds_sv) 
	{
		this.ds_sv = ds_sv;
	}

	public DS_SV() 
	{
		ds_sv = new ArrayList<sinhVien>();
	}

	public ArrayList<sinhVien> getDs_sv() 
	{
		return ds_sv;
	}

	public void setDs_sv(ArrayList<sinhVien> ds_sv) 
	{
		this.ds_sv = ds_sv;
	}
	
	public void themSV(sinhVien sv)
	{
		ds_sv.add(sv);
	}
	
	public void inDanhSach()
	{
		for(sinhVien i: ds_sv)
			System.out.println(i);
	}
	
	public boolean kiemTraDSRong()
	{
		return ds_sv.isEmpty();
	}
	
	public int soLuongSinhVien()
	{
		return ds_sv.size();
	}
	
	public void lamRongDanhSach()
	{
		ds_sv.clear();
		//ds_sv.removeAll(ds_sv);
	}
	
	public boolean kiemTraTonTai(String s)
	{
		for(sinhVien i : ds_sv)
		{
			if(i.getMaSV().compareTo(s) == 0)
				return true;
		}
		return false;
	}
	
	public void xoaSV(String s)
	{
		for(int i = 0;i<ds_sv.size();i++)
		{
			if( ds_sv.get(i).getMaSV().compareTo(s) == 0 )
				ds_sv.remove(i);
		}
	}
	
	public void timSV(String ten)
	{
		for(sinhVien sv : ds_sv)
		{
			if(sv.getHoVaTen().indexOf(ten) >= 0)
			{
				System.out.println(sv);
			}
		}
	}
	
	public void sapXep()
	{
		Collections.sort(ds_sv, new Comparator<sinhVien>() 
		{
			@Override
			public int compare(sinhVien o1, sinhVien o2) 
			{
				if(o1.getGPA() < o2.getGPA())
					return -1;
				else if( o1.getGPA() == o2.getGPA())
					return 0;
				else 
					return 1;
			}
			
		}				
		);
	}
	
	public void ghiDuLieuXuongFile(File f)
	{
		try 
		{
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for(sinhVien sv : ds_sv)
			{
				oos.writeObject(sv);
			}
			oos.flush();
			os.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void docDanhSachSV(File f)
	{
		try 
		{
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			//cách này thì sẽ không in ra cảnh báo
			while(is.available() > 0)
			{
				Object sv = ois.readObject();//Phòng trường hợp sv là null
				if(sv == null)
					break;
				else 
				{
					sv = (sinhVien) sv;
					System.out.println(sv);
				}
			}
			ois.close();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
