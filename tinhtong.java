package ex1;
import java.util.Scanner;
public class tinhtong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n,d,i;
System.out.println("Tinh tong cac so chia het cho 3");
System.out.print("Nhap n: ");
n=sc.nextInt();
d=0;
for (i=0; i<=n; i++)
	{if(i%3==0) d=d+i;}
System.out.print("Tong la: "+d);
	}

}
