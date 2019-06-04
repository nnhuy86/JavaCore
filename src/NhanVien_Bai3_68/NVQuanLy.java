package NhanVien_Bai3_68;

import java.util.*;

public class NVQuanLy extends NhanVienCLCao {
	
	private double phuCapCV;
	
	public NVQuanLy()
	{
		super();
		this.phuCapCV = 0.0;		
	}
	
	public NVQuanLy(String _ten, String _namSinh, double _luong,
			Date _ngayNhanViec, PhongBanKhoa _PBK, String _trinhDo,
			String _nganh, String _noiDT, double _phuCapCV)
	{
		super(_ten, _namSinh, _luong, _ngayNhanViec, _PBK, 
				_trinhDo, _nganh, _noiDT);
		this.phuCapCV = _phuCapCV;					
	}

	public void setPhuCapCV(double _phuCapCV)
	{
		this.phuCapCV = _phuCapCV;
	}
	
	public double getPhuCapCV()
	{
		return this.phuCapCV;
	}
	
	public void nhap()
	{
		System.out.println("Nhap thong tin cua 1 nhan vien quan ly: ");	
		super.nhap();
		
		System.out.println("nhap phu cap CV: ");
		
		Scanner scDouble = new Scanner(System.in);
		this.phuCapCV = scDouble.nextDouble();
	}
	
	public String toString()
	{
		return super.toString() +"\t"+ this.phuCapCV;
	}
	
	
	public void xuat()
	{
		System.out.println(this.toString());
	}
	
}
