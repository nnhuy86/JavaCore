package NhanVien_Bai3_68;

import java.util.Scanner;

public class Nguoi {

	private String ten;
	private String namSinh;
	
	public Nguoi()
	{
		this.ten = "";
		this.namSinh = "";
	}
	
	public Nguoi(String _ten, String _namSinh)
	{
		this.ten = _ten;
		this.namSinh = _namSinh;
	}
	
	public void setTen(String _ten)
	{
		this.ten = _ten;
	}
	
	public String getTen()
	{
		return this.ten;
	}
	
	public void setNamSinh(String _namSinh)
	{
		this.namSinh = _namSinh;
	}
	
	public String getNamSinh()
	{
		return this.namSinh;
	}
	
	public String toString()
	{
		return this.ten +"\t"+ this.namSinh; 
	}
	
	public void nhap()
	{
		Scanner scString = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.ten = scString.nextLine();
		
		System.out.println("nhap nam sinh: ");
		this.namSinh = scString.nextLine();
		
	}
}
