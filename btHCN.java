package BT;
import java.util.Scanner;
public class btHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//khai báo
Scanner sc = new Scanner(System.in);
System.out.println("Bài toán hình chữ nhật");
System.out.print("Nhập chiều dài: a= ");
float a = sc.nextFloat();
System.out.print("Nhập chiều rộng: b= ");
float b= sc.nextFloat();
//chu vi
float ChV = a*b*2;
System.out.println("Chu vi của hcn là : "+ ChV + "(dvcd)");
//Diện tích
float S = a*b;
System.out.println("Diện tích của hcn là: "+S+ "(dvdt)");
//đường chéo
float dCh = (float)Math.sqrt(a*a+b*b);
System.out.print("Đường chéo của hcn là: "+dCh);
	}

}
