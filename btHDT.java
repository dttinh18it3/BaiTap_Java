package test;

public class btHDT {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin Động Vật");
		dongVat d = new dongVat("khỉ",4);
		d.in();
		
		System.out.println("Thông tin Người");
		Nguoi a = new Nguoi("Động vật có xương sống",4,"K",12,12,2000);
		a.show();
		
		System.out.println("Thông tin Sinh Viên");
		SinhVien b = new SinhVien("Động vật có xương sống",4,"K",12,12,2000,"sict");
		b.show();
		
		
		
	}
	
}	
	
	
	//date
	class date{
		int d,m,y;
		date(int dd, int mm, int yy){
			d=dd;
			m=mm;
			y=yy;
		}
		void dislay() {
			System.out.println(d+"/"+m+"/"+y);
		}
	}

	//động vật
	class dongVat{
		String L;
		int sochi;
		dongVat(String loai, int s){
			L=loai;
			sochi=s;
		}
		public void in() {
			System.out.println("tên: "+L);
			System.out.println("số chi: "+sochi);
		}
	}


	//Người
	class Nguoi extends dongVat{
		int dd,mm,yy;
		String n;
		date ngS= new date(dd,mm,yy);
	public	Nguoi(String loai, int s, String ten, int ng, int th, int na)
	{
		super(loai,s);
		n=ten;
		dd=ng;
		mm=th;
		yy=na;
	}
		public void show() {
			System.out.println("tên "+n);
			System.out.println("ngày sinh ");
			ngS.dislay();
			
		}
	}


	//Sinh viên
	class SinhVien extends Nguoi{
		String trg;
		public SinhVien(String loai, int s,String ten, int ng, int th, int na, String tr){
			super(loai,s,ten,ng,th,na);
			trg=tr;
			
		}
		public void show() {
			super.show();
			System.out.println("trường: "+trg);
			
		}
	}

























