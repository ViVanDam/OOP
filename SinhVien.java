package QuanLyKQHT;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	protected String masv, hoTen,ngaySinh,namVaoHoc;
	protected Float diemDauVao;
	protected DSKQHT dskqht = new DSKQHT();
	protected String khoa;
	int soKiDaHoc=0;
	
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNamVaoHoc() {
		return namVaoHoc;
	}
	public void setNamVaoHoc(String namVaoHoc) {
		this.namVaoHoc = namVaoHoc;
	}
	public Float getDiemDauVao() {
		return diemDauVao;
	}
	public void setDiemDauVao(Float diemDauVao) {
		this.diemDauVao = diemDauVao;
	}
	public DSKQHT getDskqht() {
		return dskqht;
	}
	public void setDskqht(DSKQHT dskqht) {
		this.dskqht = dskqht;
	}
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String masv, String hoTen, String ngaySinh, String namVaoHoc, Float diemDauVao, DSKQHT kqhts,String khoa) {
		super();
		this.masv = masv;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.namVaoHoc = namVaoHoc;
		this.diemDauVao = diemDauVao;
		this.dskqht = kqhts;
		this.khoa = khoa;
	}
	
	public void nhap(Scanner sc) {
		System.out.print("nhap ma sinh vien: ");
		this.masv = sc.nextLine();
		System.out.print("nhap ho ten sinh vien: ");
		this.hoTen = sc.nextLine();
		System.out.print("nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.print("nhap nam vao hoc: ");
		this.namVaoHoc = sc.nextLine();
		System.out.print("nhap diem dau vao: ");
		this.diemDauVao = sc.nextFloat();
		sc.nextLine();
		System.out.print("nhap khoa dang hoc: ");
		this.khoa = sc.nextLine();
		System.out.print("nhap so hoc ky da hoc: ");
		int n = sc.nextInt();
		sc.nextLine();
		soKiDaHoc = n;
		for(int i = 0; i<n; i++) {
			this.dskqht.them(sc);
		}
	}
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", namVaoHoc=" + namVaoHoc
				+ ", diemDauVao=" + diemDauVao + ", khoa=" + khoa + ", dskqht=" + this.dskqht.xuat() + "]";
	}
	
	
}
