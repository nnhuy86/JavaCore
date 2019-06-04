package NhanVien_Bai3_68;

import java.util.*; //Scanner

public class HocVien extends Nguoi{
	
	private double diem1;
	private double diem2;
	private double diem3;
	
	public HocVien()
	{
		super();
		this.diem1 = 0.0;
		this.diem2 = 0.0;
		this.diem3 = 0.0;
	}
	
	public HocVien(String _ten, String _namSinh, 
			double _diem1, double _diem2, double _diem3)
	{
		super(_ten, _namSinh);
		this.diem1 = _diem1;
		this.diem2 = _diem2;
		this.diem3 = _diem3;
	}
	
	public void setDiem1(double _diem1)
	{
		this.diem1 = _diem1;
	}
	
	public double getDiem1()
	{
		return this.diem1;
	}
	
	public void setDiem2(double _diem2)
	{
		this.diem2 = _diem2;
	}
	
	public double getDiem2()
	{
		return this.diem2;
	}
	
	public void setDiem3(double _diem3)
	{
		this.diem3 = _diem3;
	}
	
	public double getDiem3()
	{
		return this.diem3;
	}
		
	public void nhap()
	{
		System.out.println("Nhap thong tin cua 1 hoc vien: ");
		Scanner scString = new Scanner(System.in);
		System.out.println("nhap ten: ");
		String ten = scString.nextLine();
		super.setTen(ten);
		
		System.out.println("nhap nam sinh: ");
		String namSinh = scString.nextLine();
		super.setNamSinh(namSinh);
		
		Scanner scDouble = new Scanner(System.in);
		System.out.println("nhap diem 1: ");
		this.diem1 = scDouble.nextDouble();
		
		System.out.println("nhap diem 2: ");
		this.diem2 = scDouble.nextDouble();
		
		System.out.println("nhap diem 3: ");
		this.diem3 = scDouble.nextDouble();
	}
	
	public String toString()
	{
		return super.toString() +"\t"+ this.diem1 +"\t"+
	                this.diem2 +"\t"+ this.diem3;
	}
	
	public void xuat()
	{
		System.out.println(this.toString());
	}
}
