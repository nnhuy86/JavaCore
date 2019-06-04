package NhanVien_Bai3_68;

import java.util.Scanner;

public class PhongBanKhoa {
	
	private String maPBK;
	private String tenPBK;

	public PhongBanKhoa()
	{
		this.maPBK = "";
		this.tenPBK = "";
	}
	
	public PhongBanKhoa(String _maPBK, String _tenPBK)
	{
		this.maPBK = _maPBK;
		this.tenPBK = _tenPBK;
	}
	
	public void setMaPBK(String _maPBK)
	{
		this.maPBK = _maPBK;
	}
	
	public String getMaPBK()
	{
		return this.maPBK;
	}
	
	public void setTenPBK(String _tenPBK)
	{
		this.tenPBK = _tenPBK;
	}
	
	public String getTenPBK()
	{
		return this.tenPBK;
	}
	
	public String toString()
	{
		return this.maPBK +"\t"+ this.tenPBK;
	}
	
	public void nhap()
	{
		Scanner scString = new Scanner(System.in);
		System.out.println("nhap ma phong ban khoa: ");
		this.maPBK = scString.nextLine();
		
		System.out.println("nhap ten phong ban khoa: ");
		this.tenPBK = scString.nextLine();		
	}
}
