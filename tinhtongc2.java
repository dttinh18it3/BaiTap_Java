package ex1;
import java.util.Scanner;
public class tinhtongc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n,i,d;
System.out.println("Tinh tong cac so chia het cho 3");
System.out.print("Nhap n: ");
n=sc.nextInt();
d=0;
for (i=0; i<=n; i+=3)
	{d=d+i;}
System.out.print("Tong can tinh la "+d);
	}
}
