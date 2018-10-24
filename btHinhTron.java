package BT;
import java.util.Scanner;
public class btHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Double pi = 3.1415;
System.out.println("Bài toán hình tròn");
System.out.print("Nhập bán kính : r= ");
Double r = sc.nextDouble();
Double S = r*r*pi;
System.out.println("Diện tích hình tròn là: S= "+S+" (dvdt)");
Double C = 2*r*pi;
System.out.print("Chu vi đường tròn là: "+C+ "(dvcd)");




	}

}
