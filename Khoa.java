package QuanLyKQHT;

import java.util.Scanner;

public class Khoa {
	public String tenKhoa;
	public DSSV dssvk = new DSSV();
	int count=0;
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	public DSSV getDssvk() {
		return dssvk;
	}
	public void setDssvk(DSSV dssvk) {
		this.dssvk = dssvk;
	}
	public Khoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void themKhoa(Scanner sc) {
		System.out.println("nhap ten khoa muon tao:");
		this.tenKhoa = sc.nextLine();
		System.out.println("nhap so luong sinh vien trong khoa");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <n ; i++) {
			System.out.println("nhap sinh vien thu "+ (i+1) + " :");
			dssvk.them(sc);
			count++;
			
		}
	}
	
	public void TimDiemDauVaoCaoNhat() {
		dssvk.diemDauVaoCaoNhat();
	}
	
	
	
}
