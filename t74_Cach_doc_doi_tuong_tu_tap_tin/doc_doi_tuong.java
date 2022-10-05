package t74_Cach_doc_doi_tuong_tu_tap_tin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists.DS_SV;
import t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists.sinhVien;

public class doc_doi_tuong {
	public static void main(String[] args) 
	{
		DS_SV ds = new DS_SV();
		File f = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\3.txt");
		try 
		{
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			sinhVien sv = (sinhVien) ois.readObject();
			System.out.println(sv);
			ois.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
