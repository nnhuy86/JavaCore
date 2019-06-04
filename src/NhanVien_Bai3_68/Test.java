package NhanVien_Bai3_68;

public class Test {
	
	public static void main(String[] args)
	{
		HocVien hv = new HocVien();
		hv.nhap();
		
		NVQuanLy nvql = new NVQuanLy();
		nvql.nhap();
		
		GiaoVien gv = new GiaoVien();
		gv.nhap();
		
		hv.xuat();
		nvql.xuat();
		gv.xuat();
	}
    
}
