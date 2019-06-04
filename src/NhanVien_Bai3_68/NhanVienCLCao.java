package NhanVien_Bai3_68;

import java.util.Date;
import java.util.Scanner;

public class NhanVienCLCao extends NhanVien{
	
	private String trinhDo;
	private String nganh;
	private String noiDT;
	
	public NhanVienCLCao()
	{
		super();
		this.trinhDo = "";
		this.nganh = "";
		this.noiDT = "";
	}
	
	public NhanVienCLCao(String _ten, String _namSinh, double _luong,
			Date _ngayNhanViec, PhongBanKhoa _PBK, String _trinhDo,
			String _nganh, String _noiDT)
	{
		super(_ten, _namSinh, _luong, _ngayNhanViec, _PBK);
		this.trinhDo = _trinhDo;
		this.nganh = _nganh;
		this.noiDT = _noiDT;
	}

	public void setTrinhDo(String _trinhDo)
	{
		this.trinhDo = _trinhDo;
	}
	
	public String getTrinhDo()
	{
		return this.trinhDo;
	}
	
	public void setNganh(String _nganh)
	{
		this.nganh = _nganh;
	}
	
	public String getNganh()
	{
		return this.nganh;
	}
	
	public void setNoiDT(String _noiDT)
	{
		this.noiDT = _noiDT;
	}
	
	public String getNoiDT()
	{
		return this.noiDT;
	}
	
	public String toString()
	{
		return super.toString() +"\t"+ this.trinhDo +"\t"+ this.nganh
				+"\t"+ this.noiDT;
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner scString = new Scanner(System.in);
		System.out.println("nhap trinh do: ");
		this.trinhDo = scString.nextLine();
				
		System.out.println("nhap nganh: ");
		this.nganh = scString.nextLine();
		
		System.out.println("nhap noi DT: ");
		this.noiDT = scString.nextLine();
		//scString.close();
	}
}

