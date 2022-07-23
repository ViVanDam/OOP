package QuanLyKQHT;

import java.util.Scanner;

public class SinhVienTaiChuc extends SinhVien{
	private String noiLKDT;

	public String getNoiLKDT() {
		return noiLKDT;
	}

	public void setNoiLKDT(String noiLKDT) {
		this.noiLKDT = noiLKDT;
	}

	public SinhVienTaiChuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienTaiChuc(String masv, String hoTen, String ngaySinh, String namVaoHoc, Float diemDauVao,
			DSKQHT kqhts,String khoa,String noi) {
		super(masv, hoTen, ngaySinh, namVaoHoc, diemDauVao, kqhts,khoa);
		this.noiLKDT = noi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.print("nhap noi lien ket dao tao: ");
		this.noiLKDT = sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sinh Vien Tai Chuc: noiLKDT="+ noiLKDT +super.toString();
	}
	
	
	
}
