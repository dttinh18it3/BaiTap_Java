package BT;

import java.util.Scanner;

public class bt6_chap2 {
//tổng bình phương
	public static float TBP(int N)
	{
		float kq=0;
		for(int i=1; i<=N;i++) {
			kq=(float) (kq + Math.pow(i,2));
		}
		return kq;
	} 
	
//Tổng lũy thừa cùng cơ số
	public static float TLTCCS(int N)
	{
		float kq = 0;
		for( int i=1; i<=N;i++) {
			kq=(float) (kq + Math.pow(i,i));
		}
		return kq;
	}
	
//tổng phân số dạng n/(n+1)
	public static float TongPhanSo(int N)
	{
		float kq=0;
		for(int i=1 ; i<=N;i++) {
			kq=  (kq +(float)i/(i+1)); 
		}
		return kq;
	}
	
//Nghịch đảo lũy thừa
	public static float NDGT(int N)
	{
		float kq=0;
		int gt=1;
		for(int i=1; i<=N; i++) {
			kq= kq + (float)1/(gt*i);
		}
		return  kq;
	}
	
//tổng phân số dạng (tử tổng mẫu giai thừa)
	public static float TTMGT(int N)
	{
		float kq=0;
		int tg=0,gt=1;
		for( int i=1; i<=N; i++) {
			tg=tg+i;
			gt=gt*i;
		kq= kq + (float)tg/gt;
		}
		return kq;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập n: ");
	int n= sc.nextInt();
	System.out.println("Tổng bình phương: "+TBP(n));
	sc.nextLine();
	System.out.println("Tổng lũy thừa cùng cơ số: "+TLTCCS(n));
	System.out.println("Tổng phân số (mẫu hơn tử 1 đơn vị): "+TongPhanSo(n));
	System.out.println("Tổng nghịch đảo lũy thừa: "+NDGT(n));
	System.out.println("Tổng phân số (tử tổng mẫu giai thừa): "+TTMGT(n));
	
	}

}
