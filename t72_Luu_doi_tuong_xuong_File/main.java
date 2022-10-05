package t72_Luu_doi_tuong_xuong_File;

import java.io.File;
import java.util.Scanner;

import t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists.DS_SV;
import t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists.sinhVien;

public class main{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\4.txt");
		Scanner sc = new Scanner(System.in);
		DS_SV ds_sv = new DS_SV();
		first_loop: do
		{
			System.out.println("----MENU----");
			System.out.println("1.Thêm sinh viên\n"
							 + "2.In danh sách sinh viên ra màn hình\n"
							 + "3.Kiểm tra danh sách sinh viên có rỗng hay không\n"
							 + "4.Lấy ra số lượng sinh viên trong danh sách\n"
							 + "5.Làm rỗng danh sách sinh viên"
							 + "6.Kiểm tra sinh viên có tồn tại trong danh sách hay không,dựa trên mã sinh viên\n"
							 + "7.Xoá một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n"
							 + "8.Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím\n"
							 + "9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp\n"
							 + "10.Lưu danh sách sinh viên xuống tập tin\n"
							 + "11.Đọc danh sách sinh viên từ tập tin\n"
							 + "0.Thoát khỏi chương trình");
			 int luaChon = sc.nextInt();
			 String temp = sc.nextLine();
			 switch(luaChon)
			 {
			 	case 0:
			 		break first_loop;
			 	case 1:
			 		System.out.println("Nhập mã sinh viên");	String maSV = sc.nextLine();
			 		System.out.println("Nhập họ và tên");		String hoTen = sc.nextLine();
			 		System.out.println("Nhập năm sinh");	 	String namSinh= sc.nextLine();
			 		System.out.println("Nhập điểm trung bình");	float GPA = sc.nextFloat();
			 		sinhVien TEMP = new sinhVien(maSV ,hoTen ,namSinh ,GPA);
			 		ds_sv.themSV(TEMP);
			 		break;
			 	case 2:
			 		ds_sv.inDanhSach();
			 		break;
			 	case 3:
		 			System.out.println("Danh sách rỗng: " + ds_sv.kiemTraDSRong());
			 		break;
			 	case 4:
		 			System.out.println("Số lượng sinh viên: " + ds_sv.soLuongSinhVien());
			 		break;
			 	case 5:
			 		System.out.println("Danh sách đã được làm rỗng");
		 			ds_sv.lamRongDanhSach();
			 		break;
			 	case 6:
		 			System.out.println("Nhập mã sinh viên cần tìm: ");
		 			String fcode = sc.nextLine();
		 			System.out.println("Sinh viên có mã sinh viên " + fcode +" tồn tại trong danh sách là: " + ds_sv.kiemTraTonTai(fcode));
			 		break;
			 	case 7:
		 			System.out.println("Nhập mã sinh viên cần xoá: ");
		 			fcode = sc.nextLine();
		 			System.out.println("Đã xoá sinh viên có mã sinh viên " + fcode + " ra khỏi danh sách");
		 			ds_sv.xoaSV(fcode);
			 		break;
			 	case 8:
		 			System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
		 			String fname = sc.nextLine();
		 			ds_sv.timSV(fname);
			 		break;
			 	case 9:
		 			ds_sv.sapXep();
			 		break;
			 	case 10:
			 		ds_sv.ghiDuLieuXuongFile(f);
			 		break;
			 	case 11:
			 		ds_sv.docDanhSachSV(f);
			 		break;
			 }

		}while(true);
	}
}
