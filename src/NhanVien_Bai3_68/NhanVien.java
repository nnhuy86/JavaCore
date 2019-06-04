package NhanVien_Bai3_68;

import java.util.*;

public class NhanVien extends Nguoi{
	
	private double luong;
	private Date ngayNhanViec;
	private PhongBanKhoa PBK;

	public NhanVien()
	{
		super();
		this.luong = 0.0;
		this.ngayNhanViec = new Date();
		this.PBK = new PhongBanKhoa(); 
				
	}
	
	public NhanVien(String _ten, String _namSinh, double _luong,
			Date _ngayNhanViec, PhongBanKhoa _PBK)
	{
		super(_ten, _namSinh);
		this.luong = _luong;
		this.ngayNhanViec = _ngayNhanViec;
		this.PBK = _PBK;
		
	}
	
	public void setLuong(double _luong)
	{
		this.luong = _luong;
	}
	
	public double getLuong()
	{
		return this.luong;
	}
	
	public void setNgayNhanViec(Date _ngayNhanViec)
	{
		this.ngayNhanViec = _ngayNhanViec;
	}
	
	public Date getNgayNhanViec()
	{
		return this.ngayNhanViec;
	}
	
	public void setPhongBanKhoa(PhongBanKhoa _pBK)
	{
		this.PBK = _pBK;
	}
	
	public PhongBanKhoa getPhongBanKhoa()
	{
		return this.PBK;
	}
	
	public String toString()
	{
		return super.toString() +"\t"+ this.luong +"\t"+ this.ngayNhanViec
				+"\t"+ this.PBK.toString();
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner scDouble = new Scanner(System.in);
		System.out.println("nhap luong: ");
		this.luong = scDouble.nextDouble();
		
		
		this.ngayNhanViec = new Date();
		
		this.PBK.nhap();
	}
}
