package QuanLyKQHT;

import java.util.Scanner;

public class SinhVienChinhQuy extends SinhVien{

	public SinhVienChinhQuy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienChinhQuy(String masv, String hoTen, String ngaySinh, String namVaoHoc, Float diemDauVao,
			DSKQHT kqhts,String khoa) {
		super(masv, hoTen, ngaySinh, namVaoHoc, diemDauVao, kqhts,khoa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sinh Vien Chinh Quy:" + super.toString();
	}
	
	
}
