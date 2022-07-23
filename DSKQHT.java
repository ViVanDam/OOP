package QuanLyKQHT;

import java.util.ArrayList;
import java.util.Scanner;

public class DSKQHT {
	public ArrayList<KQHT> ds = new ArrayList<KQHT>();

	public ArrayList<KQHT> getDs() {
		return ds;
	}

	public void setDs(ArrayList<KQHT> ds) {
		this.ds = ds;
	}

	public DSKQHT(ArrayList<KQHT> ds) {
		super();
		this.ds = ds;
	}
	
	public DSKQHT() {
		ds = new ArrayList<KQHT>();
	}
	
	public void them(Scanner sc) {
		KQHT kqht = new KQHT();
		kqht.nhap(sc);
		ds.add(kqht);
	}
	
	public String xuat() {
		for(KQHT i : ds) {
			return i.toString();
		}
		return super.toString();
	}
	
	public float dTBHocKyCaoNhat() {
		float max = 0;
		for (int i = 0; i < ds.size(); i++) {
			if(ds.get(i).dTBHocKy>max) {
				max = ds.get(i).dTBHocKy;
			}
		}
		return max;
	}
	
}
