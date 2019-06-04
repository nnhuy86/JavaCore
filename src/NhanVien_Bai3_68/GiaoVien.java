package NhanVien_Bai3_68;

import java.util.Date;
import java.util.Scanner;

public class GiaoVien extends NhanVienCLCao {
	
	private double thuLaoGD;
	
	public GiaoVien()
	{
		super();
		this.thuLaoGD = 0.0;
	}

	public GiaoVien(String _ten, String _namSinh, double _luong,
			Date _ngayNhanViec, PhongBanKhoa _PBK, String _trinhDo,
			String _nganh, String _noiDT, double _thuLaoGD)
	{
		super(_ten, _namSinh, _luong, _ngayNhanViec, _PBK, 
				_trinhDo, _nganh, _noiDT);
		this.thuLaoGD = _thuLaoGD;
	}
	
	public void setThuLao(double _thuLaoGD)
	{
		this.thuLaoGD = _thuLaoGD;
	}
	
	public double getThuLaoGD()
	{
		return this.thuLaoGD;
	}
	
	public String toString()
	{
		return super.toString() +"\t"+ this.thuLaoGD;
	}
	
	public void nhap()
	{
		System.out.println("Nhap thong tin cua 1 giao vien: ");
		
		Scanner scDouble = new Scanner(System.in);
		System.out.println("Nhap thu lao gd: ");
		this.thuLaoGD = scDouble.nextDouble();
		
		super.nhap();
//		scDouble.close();
	}
	
	public void xuat()
	{
		System.out.println(this.toString());
	}
	
	
}
