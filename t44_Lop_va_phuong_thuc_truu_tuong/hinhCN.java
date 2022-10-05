package t44_Lop_va_phuong_thuc_truu_tuong;

public class hinhCN extends hinh
{
	private double chieuRong, chieuCao;

	public hinhCN(toaDo toado, double chieuRong, double chieuCao) 
	{
		super(toado);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich()
	{
		return chieuCao * chieuRong;
	}

}
