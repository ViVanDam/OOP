package QuanLyKQHT;

import java.util.ArrayList;
import java.util.Scanner;

public class KQHT {
	public String tenHocKy;
	public float dTBHocKy;

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public float getdTBHocKy() {
		return dTBHocKy;
	}

	public void setdTBHocKy(float dTBHocKy) {
		this.dTBHocKy = dTBHocKy;
	}

	public KQHT() {
		ArrayList<KQHT> ds = new ArrayList<KQHT>();
	}
	
	public void nhap(Scanner sc) {
		System.out.print("nhap hoc ky: ");
		this.tenHocKy = sc.nextLine();
		System.out.print("nhap diem trung binh hoc ky: ");
		this.dTBHocKy = sc.nextFloat();
		sc.nextLine();
	}

	@Override
	public String toString() {
		return ", tenHocKy=" + tenHocKy + ", dTBHocKy=" + dTBHocKy;
	}
	
	
}