package t68_Lay_thong_tin_cua_tap_tin;

import java.io.File;
import java.util.Scanner;

public class main 
{
	File file;
	
	public main(String tenFile) 
	{
		this.file = new File(tenFile);
	}
	
	public boolean kiemTraThucThi()
	{
		return file.canExecute();
	}
	
	public boolean kiemTraDoc()
	{
		return file.canRead();
	}
	
	public boolean kiemTraGhi()
	{
		return file.canWrite();
	}

	public void inDuongDan()
	{
		System.out.println(file.getAbsolutePath());
	}
	
	public void inTen()
	{
		System.out.println(file.getName());
	}
	
	public void kiemTraLaThuMucHayTapTin()
	{
		if(file.isDirectory())
			System.out.println("Đây là thư mục");
		else if(file.isFile())
			System.out.println("Đây là tập tin");
	}
	
	public void inDanhSachFileCon()
	{
		if(file.isDirectory())
		{
			System.out.println("Các tập tin con là: ");
			File mangCon[] = file.listFiles();
			for(File f : mangCon)
			{
				System.out.print(f);
			}
		}
		else if(file.isFile())
			System.out.println("Đây là tập tin");
	}
	
	public void inCayThuMuc()
	{
		inChiTiet(file, 1);
	}
	
	private void inChiTiet(File f,int bac)
	{
		for(int i = 0;i<bac;i++)
		{
			System.out.print("\t");
		}
		System.out.println(f.getName());
		File mangCon[] = f.listFiles();
		if(f.isDirectory())
		{
			for(File F:mangCon)
			{
				inChiTiet(F, bac+1);
			}
		}	
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ten file: ");
		String tenFile = scanner.nextLine();
		main vdf = new main(tenFile);
		
		chuongTrinh:while(true)
		{
			System.out.println("----MENU----\n"
							 + "0.Kết thúc chương trình\n"
							 + "1.Kiểm tra file có thể thực thi\n"
							 + "2.Kiểm tra file có thể đọc\n"
							 + "3.Kiểm tra fle có thể ghi\n"
							 + "4.In đường dẫn\n"
							 + "5.In tên file\n"
							 + "6.Kiểm tra file là thư mục hay tập tin\n"
							 + "7.In ra danh sách các file con\n"
							 + "8.In ra cây thư mục\n");
			int luaChon = scanner.nextInt();
			scanner.nextLine();
			switch (luaChon)
			{
				case 0:
					break chuongTrinh;
				case 1:
					System.out.println("File có thể thực thi: " + vdf.kiemTraThucThi());
					break;
				case 2:
					System.out.println("File có thể đọc: " + vdf.kiemTraDoc());
					break;
				case 3:
					System.out.println("File có thể ghi: " + vdf.kiemTraGhi());
					break;
				case 4:
					vdf.inDuongDan();
					break;
				case 5:
					vdf.inTen();
					break;
				case 6:
					vdf.kiemTraLaThuMucHayTapTin();
					break;
				case 7:
					vdf.inDanhSachFileCon();
					break;
				case 8:
					vdf.inCayThuMuc();
					break;
			}
		}
	}
}
