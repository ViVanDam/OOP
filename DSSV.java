package QuanLyKQHT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class DSSV {
	private ArrayList<SinhVien> dSinhViens;
	
	public DSSV() {
		dSinhViens = new ArrayList<SinhVien>();
	}
	
	public boolean kiemTraMa(SinhVien x) {
		for(SinhVien i : dSinhViens) {
			if(i.getMasv().equalsIgnoreCase(x.getMasv())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean them(Scanner sc) {
		SinhVien sv;
		System.out.println("nhap loai sinh vien muon them: 1.chinh quy 2.tai chuc");
		int loai = sc.nextInt();
		sc.nextLine();
		
		if(loai == 1) {
			sv = new SinhVienChinhQuy();
			sv.nhap(sc);
		}else {
			sv = new SinhVienTaiChuc();
			sv.nhap(sc);
		}
		
		if(kiemTraMa(sv)) {
			System.out.println("them that bai!");
			return false;
		}else {
			dSinhViens.add(sv);
			System.out.println("them thanh cong!");
			return true;
		}
	}
	
	public void xuatDS() {
		for (int i = 0; i < dSinhViens.size(); i++) {
			System.out.println(dSinhViens.get(i).toString());
		}
	}
	
	public void layDTBquaHocKy(String x) {
		for(int i = 0; i< dSinhViens.size(); i++) {
			if(dSinhViens.get(i).getDskqht().ds.get(i).tenHocKy.equalsIgnoreCase(x)) {
				System.out.println("ma sinh vien: "+ dSinhViens.get(i).masv +", ten sinh vien: "+dSinhViens.get(i).hoTen+
						", DTB Hoc ky "+x+": "+dSinhViens.get(i).getDskqht().ds.get(i).dTBHocKy);
			}
		}
	}
	
	public void diemDauVaoCaoNhat() {
		float max = 0;
		for (int i = 0; i < dSinhViens.size(); i++) {
			if(max<dSinhViens.get(i).getDiemDauVao()) {
				max = dSinhViens.get(i).getDiemDauVao();
			}
		}
		for (int i = 0; i < dSinhViens.size(); i++) {
			if(max==dSinhViens.get(i).getDiemDauVao()) {
				System.out.println(dSinhViens.toString());
			}
		}
		
	}
	
	public void xuatDSSVTCtheoNoiLKDT(String noi) {
		for(SinhVien i: dSinhViens) {
			if(i instanceof SinhVienTaiChuc && ((SinhVienTaiChuc) i).getNoiLKDT().equalsIgnoreCase(noi)) {
				System.out.println(i.toString());
			}
		}
	}
	
	public void xuatDSSVcoDTBtren8() {
		for(int i = 0; i< dSinhViens.size(); i++) {
			int s = dSinhViens.get(i).getDskqht().getDs().size();
			if(dSinhViens.get(i).getDskqht().ds.get(s-1).getdTBHocKy()>8.0) {
				System.out.println(dSinhViens.get(i).toString());
			}
		}
	}
	
	public void xuatDTBHKCaoNhat() {
		SinhVien x = new SinhVien();
		for(int i=0; i<dSinhViens.size(); i++) {
			if(dSinhViens.get(i).dskqht.dTBHocKyCaoNhat()<dSinhViens.get(i+1).dskqht.dTBHocKyCaoNhat()) {
				x = dSinhViens.get(i);
			}
		System.out.println(x.toString());
		}	
	}
	
//	public void sapXep() {
//		Collections.sort(dSinhViens, new Comparator<SinhVien>() {
//
//			@Override
//			public int compare(SinhVien o1, SinhVien o2) {
//				int loai;
//				if(o1 instanceof SinhVienChinhQuy) {
//					loai =1;
//				}else {
//					loai = 0;
//				}
//				
//				if()
//			}
//		});
//	}
	
	public void soLuongTheoNam() {
		int n1=0,n2=0,n3=0,n4=0,n5=0;
		for (int i = 0; i < dSinhViens.size(); i++) {
			if(dSinhViens.get(i).namVaoHoc.equalsIgnoreCase("2018")) {
				n1++;
			}else if (dSinhViens.get(i).namVaoHoc.equalsIgnoreCase("2019")) {
				n2++;
			}else if (dSinhViens.get(i).namVaoHoc.equalsIgnoreCase("2020")) {
				n3++;
			}else if (dSinhViens.get(i).namVaoHoc.equalsIgnoreCase("2021")) {
				n4++;
			}else if(dSinhViens.get(i).namVaoHoc.equalsIgnoreCase("2022")){
				n5++;
			}
		}
		System.out.println("thong ke so luong sinh vien theo nam vao hoc:");
		System.out.print("nam 2018: "+n1);
		System.out.print("nam 2019: "+n2);
		System.out.print("nam 2020: "+n3);
		System.out.print("nam 2021: "+n4);
		System.out.print("nam 2022: "+n5);
	}
}
