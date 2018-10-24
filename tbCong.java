package BT;
import java.util.Scanner;
import java.text.DecimalFormat;
public class tbCong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Tính trung bình cộng 3 số");
System.out.print("Nhập a: ");
float a = sc.nextFloat();
System.out.print("Nhập b: ");
float b= sc.nextFloat();
System.out.print("Nhập c: ");
float c= sc.nextFloat();
DecimalFormat df = new DecimalFormat("#.000");
float tbc = (a+b+c)/3;
System.out.print("Trung bình cộng 3 số trên là: "+ df.format(tbc));
	}

}
