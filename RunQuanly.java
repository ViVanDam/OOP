package QuanLyKQHT;

import java.util.Scanner;

public class RunQuanly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		Scanner sc = new Scanner(System.in);
		Khoa CNTT = new Khoa();
		Khoa CoKhi = new Khoa();
		Khoa Dien = new Khoa();
		Khoa Luat = new Khoa();
		
		do {
			System.out.println("\t\t========= M-E-N-U ==========");
			System.out.println("\t1.them sinh vien vao danh sach khoa");
			System.out.println("\t2.xuat");
			System.out.println("\t3.lay diem trung binh cac mon hoc cua sinh vien dua vao hoc ky cho truoc");
			System.out.println("\t4.tim ra sinh vien có diem dau vao cao nhat o moi khoa");
			System.out.println("\t5.lay ra danh sach sinh vien o moi khoa theo noi lien ket dao tao");
			System.out.println("\t6.lay ra danh sach sinh vien co diem trung binh gan nhat lon hon 8.0");
			System.out.println("\t7.tim ra sinh vien co diem trung binh hoc ky cao nhat moi khoa");
			System.out.println("\t8.sap xep danh sach sinh vien tang dan theo loai va giam dan theo nam vao hoc");
			System.out.println("\t9.thong ke so luong sinh vien theo nam vao hoc");
			System.out.println("\t0.thoat");
			System.out.print("\tMoi nhap lua chon: ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1:
				System.out.println("moi chon khoa muon nhap:");
				System.out.println("1.CNTT");
				System.out.println("2.Co Khi");
				System.out.println("3.Dien");
				System.out.println("4.Luat");
				int loai = sc.nextInt();
				sc.nextLine();
				if(loai==1) {
					CNTT.themKhoa(sc);					
				}else if (loai==2) {
					CoKhi.themKhoa(sc);	
				}else if (loai==3) {
					Dien.themKhoa(sc);	
				}else if (loai==4) {
					Luat.themKhoa(sc);	
				}
				System.out.println();
				break;
			case 2:
				System.out.println("danh sach sinh vien khoa CNTT:");
				CNTT.getDssvk().xuatDS();
				System.out.println("danh sach sinh vien khoa CNTT:");
				CoKhi.getDssvk().xuatDS();
				System.out.println("danh sach sinh vien khoa CNTT:");
				Dien.getDssvk().xuatDS();
				System.out.println("danh sach sinh vien khoa CNTT:");
				Luat.getDssvk().xuatDS();
				System.out.println();
				break;
			case 3:
				System.out.print("nhap hoc ki muon lay: ");
				String hk = sc.nextLine();
				CNTT.getDssvk().layDTBquaHocKy(hk);
				System.out.println();
				break;
			case 4:
				System.out.println("sinh vien khoa CNTT co diem dau vao cao nhat:");
				CNTT.getDssvk().diemDauVaoCaoNhat();
				System.out.println("sinh vien khoa Co Khi co diem dau vao cao nhat:");
				CoKhi.getDssvk().diemDauVaoCaoNhat();
				System.out.println("sinh vien khoa Dien co diem dau vao cao nhat:");
				Dien.getDssvk().diemDauVaoCaoNhat();
				System.out.println("sinh vien khoa Luat co diem dau vao cao nhat:");
				Luat.getDssvk().diemDauVaoCaoNhat();
				System.out.println();
				break;
			case 5:
				System.out.print("nhap noi lien ket dao tao muon tim: ");
				String noi = sc.nextLine();
				System.out.println("sinh vien tai chuc khoa CNTT o : "+ noi+ " :");
				CNTT.getDssvk().xuatDSSVTCtheoNoiLKDT(noi);
				System.out.println("sinh vien tai chuc khoa Co Khi o : "+ noi+ " :");
				CoKhi.getDssvk().xuatDSSVTCtheoNoiLKDT(noi);
				System.out.println("sinh vien tai chuc khoa Dien o : "+ noi+ " :");
				Dien.getDssvk().xuatDSSVTCtheoNoiLKDT(noi);
				System.out.println("sinh vien tai chuc khoa Luat o : "+ noi+ " :");
				Luat.getDssvk().xuatDSSVTCtheoNoiLKDT(noi);
				System.out.println();
				break;
			case 6:
				CNTT.getDssvk().xuatDSSVcoDTBtren8();
				System.out.println();
				break;
			case 7:
				CNTT.dssvk.xuatDTBHKCaoNhat();
				System.out.println();
				break;
			case 8:
				System.out.println();
				break;
			case 9:
				CNTT.dssvk.soLuongTheoNam();
				System.out.println();
				break;
			case 10:
				System.out.println();
				break;
			case 11:
				System.out.println();
				break;
			}
		} while (chon != 0);
	}

}
